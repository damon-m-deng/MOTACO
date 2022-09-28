package com.game.controller;

import com.game.characters.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Game {
    User user;
    Heroes hero;
    Monsters monster = null;

    private Scanner scanner = new Scanner(System.in);
    private int rand = (int) ((Math.random() * 2) + 1);

    public void start(){
        user = UserFactory.createUser(scanner);
        playerSetUp();

        hero = HeroesFactory.createHeroes(scanner);
        firstMission();
    }
    public void playerSetUp() {
        System.out.println("Greetings, my Hero! \nWhat should I call you?");
        user.setUserName(scanner.nextLine());
        System.out.printf("Welcome, %s!%nPlease choose a hero of your choice!", user.getUserName());
        System.out.println();
    }

    // first mission
    public void firstMission() {
        System.out.println("You stepped out the gate of your village. What do you do?");
        System.out.println("1. Go North.");
        System.out.println("2. Go South.");

        String userChoice = scanner.nextLine();
        if ("1".equals(userChoice)) {
            hero.setHp(hero.getHp() - 5);
            System.out.println("The hero went to the north... Stepped on a banana peel, and fell on their bottom. Ouch...");
            generateMonster();
            System.out.println("You ran into a " + monster.getName());
            fight();
        } else if ("2".equals(userChoice)) {
            generateMonster();
            System.out.println("You ran into a " + monster.getName());
            fight();
        }
    }

    public void fight() {
        System.out.println("You have entered a fight!");
        System.out.println("-----------------------");
        showCombatMessage();
        while (hero.hp > 0) {
            String userChoice = scanner.nextLine();
            showCombatMessage();
            if (hero.getHp() > 0 && monster.getMonsterHP() > 0) {
                if ("1".equals(userChoice)) {
                    attack();
                } else if ("2".equals(userChoice)) {
                    useSpecialSkill();
                } else if ("3".equals(userChoice)) {
                    useItems();
                }
            }
            else{
                if(hero.getHp()>0 && monster.getMonsterHP()<=0){
                    victory();
                }
            }
        }
        gameover();
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
        System.out.println("Hero: " + hero.getName() + " HP: " + hero.getHp() + " Attack Power: " + hero.getAttackPower());      //added
        System.out.println("Monster HP: " + monster.getMonsterHP());
        System.out.println("What do you do?");
        System.out.println("1. Attack");
        System.out.println("2. Use Special skills");
        System.out.println("3. Use an item");
    }



    private void gameover() {
        System.out.println(user.getUserName() + ", You died...");
    }

    private void victory() {
        System.out.println("You defeated the " + monster.getName() + "!");
        System.out.println("Yay");
        dropItem();
        System.out.println();
    }

    private void attack() {

        int monsterHp = monster.getMonsterHP();
        monsterHp = monsterHp - hero.getAttackPower();
        monster.setMonsterHP(monsterHp);
        System.out.println(hero.getName() + " attacked the " + monster.getName() + ", " + monster.getName() + " has " + monsterHp + " HP left!");
        hero.setAttackPower(((int) ((Math.random() * 9) + 1)));


        int heroHp = hero.getHp();
        heroHp = heroHp - monster.getAttackPower();
        hero.setHp(heroHp);
        System.out.println(monster.getName() + " attacked the " + hero.getName() + ", " + hero.getName() + " has " + heroHp + " HP left!");
        monster.setAttackPower(((int) ((Math.random() * 9) + 1)));

    }

    private void generateMonster() {
        monster = MonstersFactory.generateMonster(rand);
    }

    public void useSpecialSkill() {     //TODO: add special skill
        System.out.println("You used your special skill!");
        if (hero instanceof Wizard) {
            ((Wizard) hero).useSpecialAbility();
        } else if (hero instanceof WarriorPrincess) {
            ((WarriorPrincess) hero).useSpecialAbility();
        } else if (hero instanceof WaywardKnight) {
            ((WaywardKnight) hero).useSpecialAbility();
        }
    }




    public void useItems() {
        System.out.println("You used an item!");


    }

}












