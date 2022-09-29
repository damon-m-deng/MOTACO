package com.game.controller;

import com.apps.util.Console;
import com.game.characters.*;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class GameController {
    User user;
    Heroes hero;
    Monsters monster = null;
    AsciiGen asciiGen;

    private Scanner scanner = new Scanner(System.in);
    private int rand = (int) ((Math.random() * 2) + 1);
    private String title = "MOTACO";
    private String gameOverText = "GAME OVER";

    public void start() {
        asciiGen = AsciiFactory.createAscii();
        //print title ascii
        //loadAsciiTitle(title);
        welcomeScreen();

        user = UserFactory.createUser(scanner);
        playerSetUp();
        System.out.println();

        hero = HeroesFactory.createHeroes(scanner);
        firstMission();
        System.out.println();

    }

    //welcome screen with ascii art
    public void welcomeScreen() {

        System.out.println("Welcome to the game!");
        System.out.println("\n" +
                "     e    e        ,88~-_   ~~~888~~~      e       e88~-_    ,88~-_             " +
                " e      888~-_   Y88b      / 888~~  888b    | ~~~888~~~ 888   | 888~-_   888~~  " +
                "\n" +
                "    d8b  d8b      d888   \\     888        d8b     d888   \\  d888   \\         " +
                "   d8b     888   \\   Y88b    /  888___ |Y88b   |    888    888   | 888   \\  " +
                "888___ \n" +
                "   d888bdY88b    88888    |    888       /Y88b    8888     88888    |          " +
                "/Y88b    888    |   Y88b  /   888    | Y88b  |    888    888   | 888    | 888   " +
                " \n" +
                "  / Y88Y Y888b   88888    |    888      /  Y88b   8888     88888    |         / " +
                " Y88b   888    |    Y888/    888    |  Y88b |    888    888   | 888   /  888    " +
                "\n" +
                " /   YY   Y888b   Y888   /     888     /____Y88b  Y888   /  Y888   /         " +
                "/____Y88b  888   /      Y8/     888    |   Y88b|    888    Y88   | 888_-~   888 " +
                "   \n" +
                "/          Y888b   `88_-~      888    /      Y88b  \"88_-~    `88_-~         /  " +
                "    Y88b 888_-~        Y      888___ |    Y888    888     \"8__/  888 ~-_  " +
                "888___ \n" +
                "                                                                                " +
                "                                                                                \n");

        System.out.println("MOTACO - Chapter 1");
        System.out.println("A strange evil has taken over the land...");
        System.out.println("Monsters have stolen all of our Tacos and Momos!");
        System.out.println("We need your help to get them back!");
        System.out.println();

    }


    public void playerSetUp() {
        System.out.println("Greetings, my Hero! \nWhat should I call you?");

        while(true) {
            String userInput = scanner.nextLine();
            if (userInput.length() == 0) {
                System.out.println("Please enter your name: ");
                System.out.println();
            } else {
                user.setUserName(userInput);
                System.out.printf("Welcome, %s!%nPlease choose a hero of your choice!", user.getUserName());
                System.out.println();
                break;
            }
        }

    }

    //method to generate ascii for the text
    public void loadAsciiTitle(String text) {
        AsciiGen.Settings settings = asciiGen.new Settings(new Font("SansSerif", Font.BOLD, 16), text.length() * 30, 30); // 30 pixel width per character
        asciiGen.drawString(text, "|", settings);
    }

    // first mission
    public void firstMission() {
        while(true) {
            System.out.println("You stepped out the gate of your village. What do you do?");
            System.out.println("1. Go North.");
            System.out.println("2. Go South.");
            System.out.println();

            String userChoice = scanner.nextLine();
            if ("1".equals(userChoice)) {
                hero.setHp(hero.getHp() - 5);
                System.out.println("The hero went to the north... Stepped on a banana peel, and fell on their bottom. Ouch...");
                Console.pause(500);
                System.out.println();

                generateMonster();
                System.out.println("You ran into a " + monster.getName());
                fight();
            } else if ("2".equals(userChoice)) {
                generateMonster();
                System.out.println("You ran into a " + monster.getName());
                fight();
            }
            else{
                System.out.println("please select, [1-North/2-South]");
                System.out.println();
            }
        }
    }

    public void fight() {
        System.out.println("You have entered a fight!");
        System.out.println("-----------------------");
        showCombatMessage();
        while (hero.hp > 0) {
            String userChoice = scanner.nextLine();
            if (hero.getHp() > 0 && monster.getMonsterHP()>0) {
                if ("1".equals(userChoice)) {
                    attack();
                } else if ("2".equals(userChoice)) {
                    useSpecialSkill();
                }
            }
            else if(monster.getMonsterHP()<=0){
                victory();
                continueGame();
                break;
            }
            else if(hero.getHp()<=0){
                gameover();
            }
            Console.pause(1000);
            showCombatMessage();

            Console.clear();
        }
    }

    private void continueGame() {
        while(true) {
            System.out.println("Would you like to continue?");
            Console.pause(1000);
            System.out.println("1: Yes");
            System.out.println("2. No");
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if ("1".equals(userInput)) {
                fight();
            } else if ("2".equals(userInput)) {
                System.out.println("Thank you for playing MOTACO!");
                break;
            } else {
                System.out.println("please select, [1-Yes/2-No]");
            }
        }
    }

    public void dropItem() {
        int rand = (int) ((Math.random() * 2) + 1);
        if (rand == 1) {
            System.out.println("The enemy dropped a MOMO which is a delicious treat!"); //TODO: make these items enum
            System.out.println("Do you want to pick it up?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            String userChoice = scanner.nextLine();
            if ("1".equals(userChoice)) {
                System.out.println("You picked up the MOMO!");
                hero.setHp(hero.getHp() + 10);
            } else if ("2".equals(userChoice)) {
                System.out.println("You left the MOMO on the ground. Maybe you prefer Tacos?");
            }
        } else if (rand == 2) {
            System.out.println("The enemy dropped 2 TACOS!");
            System.out.println("Do you want to pick it up?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.println();
            String userChoice = scanner.nextLine();
            if ("1".equals(userChoice)) {
                System.out.println("You ate the TACOS and feel stronger!");
                hero.setAttackPower(hero.getAttackPower() + 10);
            } else if ("2".equals(userChoice)) {
                System.out.println("You left the TACOS. Maybe you wanted MOMOS? .");
            } else {
                System.out.println("Please select a character by entering '1', '2', or '3'");
            }
        }
    }

    private void showCombatMessage() {
        System.out.println("An enemy appeared! Your stats are: "); //added
        //print out monster hp
        System.out.println();
        System.out.println("Hero: " + hero.getName() + " HP: " + hero.getHp() + " Attack Power: " + hero.getAttackPower());      //added
        System.out.println();
        System.out.println("Monster HP: " + monster.getMonsterHP());
        System.out.println();
        System.out.println("What do you do?");
        System.out.println("1. Attack");
        System.out.println("2. Use Special skills");
        System.out.println("3. Use an item");
        System.out.println();
    }


    private void gameover() {
        System.out.println(user.getUserName() + ", You died...");
        //print gameover ascii
        //loadAsciiTitle(gameOverText);
    }

    private void victory() {
        System.out.println("-------Victory!!!-------");
        dropItem();
    }

    private void attack() {

        int monsterHp = monster.getMonsterHP();
        monsterHp = monsterHp - hero.getAttackPower();
        monster.setMonsterHP(monsterHp);
        System.out.println(hero.getName() + " attacked the " + monster.getName() + ", " + monster.getName() + " has " + monsterHp + " HP left!");
        hero.setAttackPower(((int) ((Math.random() * 9) + 1)));
        System.out.println();

        Console.pause(1000);

        int heroHp = hero.getHp();
        heroHp = heroHp - monster.getAttackPower();
        hero.setHp(heroHp);
        System.out.println(monster.getName() + " attacked the " + hero.getName() + ", " + hero.getName() + " has " + heroHp + " HP left!");
        monster.setAttackPower(((int) ((Math.random() * 9) + 1)));
        System.out.println();

        generateResource();
        Console.pause(1000);
    }

    private void generateMonster() {
        monster = MonstersFactory.generateMonster(rand);
    }

    public void useSpecialSkill() {
        System.out.println("You used your special skill!");
        if (hero instanceof Wizard) {
            ((Wizard) hero).useSpecialAbility();
            Console.pause(1000);
        } else if (hero instanceof WarriorPrincess) {
            ((WarriorPrincess) hero).useSpecialAbility();
            Console.pause(1000);
        } else if (hero instanceof WaywardKnight) {
            ((WaywardKnight) hero).useSpecialAbility();
            Console.pause(1000);
        }
    }

    private void generateResource() {
        if (hero instanceof Wizard) {
            int wizardMp = ((Wizard) hero).getMp();
            wizardMp += 10;
            ((Wizard) hero).setMp(wizardMp);
            Console.pause(1000);
            System.out.println("Wizard regenerated 10 mana.");
        } else if (hero instanceof WarriorPrincess) {
            int warriorPrincessRage = ((WarriorPrincess) hero).getRage();
            warriorPrincessRage += 15;
            ((WarriorPrincess) hero).setRage(warriorPrincessRage);
            Console.pause(1000);
            System.out.println("Warrior Princess generated 10 rage from the damage.");
        } else if (hero instanceof WaywardKnight) {
            int kightEnergy = ((WaywardKnight) hero).getEnergy();
            kightEnergy += 15;
            ((WaywardKnight) hero).setEnergy(kightEnergy);
        }
    }
}












