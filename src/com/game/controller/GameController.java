package com.game.controller;

import com.apps.util.Console;
import com.game.characters.*;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class GameController {
    User user;
    Heroes hero;
    Monsters monster = null;

    private Scanner scanner = new Scanner(System.in);
    private int rand = (int) ((Math.random() * 2) + 1);
    private String title = "MOTACO";
    private String gameOverText = "GAME OVER";

    public void start() {
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
        //print from file in images folder
        try (BufferedReader br = new BufferedReader(new FileReader("images/banner.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();        // spaces
        System.out.println();        // spaces

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
        System.out.println("Enemies nearby! Your stats are: "); //added
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
        System.out.println("You have a very particular set of skills!");
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












