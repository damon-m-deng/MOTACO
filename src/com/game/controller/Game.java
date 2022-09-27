package com.game.controller;

import com.game.characters.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Game {
    private Scanner scanner = new Scanner(System.in);
    Heroes hero = HeroesFactory.createHeroes(scanner);
    private int rand = (int) ((Math.random() * 2) + 1);
    Monsters monster = null;

    public void playerSetUp() {
        System.out.println("Hello " + hero.getName() + ". Let's start the game!");
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
        System.out.println("You have enter a fight!");
        System.out.println("-----------------------");
        showCombatMessage();
        while (hero.hp > 0) {
            String userChoice = scanner.nextLine();
            if (hero.getHp() > 0) {
                if ("1".equals(userChoice)) {
                    attack();
                } else if ("2".equals(userChoice)) {
                    useSpecialSkill();
                } else if ("3".equals(userChoice)) {
                    useItems();
                }
            }
            showCombatMessage();
        }
        gameover();
    }

    private void showCombatMessage() {

        System.out.println("What do you do?");
        System.out.println("1. Attack");
        System.out.println("2. Use Special skills");
        System.out.println("3. Use an item");
    }

    private void gameover() {
        System.out.println("You died...");
    }

    private void victory() {
        System.out.println("Yay");
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

    public void useSpecialSkill() {

    }

    public void useItems() {

    }

    /*
     *  Main Loop
     */
    public static void parseCommand(List<String> wordList) {
        String verb;
        String noun;
        List<String> commands = new ArrayList<>(Arrays.asList("pickUp", "leave"));
        List<String> objects = new ArrayList<>(Arrays.asList("potion, smellyCheese, shinyThing"));

        if (wordList.size() != 2) {
            System.out.println("Please type in 2 words or less!");
        } else {
            verb = wordList.get(0);
            noun = wordList.get(1);
            if (!commands.contains(verb)) {
                System.out.println(verb + " unknown verb!");
            }
            if (!objects.contains(noun)) {
                System.out.println(noun + " unknown noun!");
            }
        }
    }

    public static List<String> wordList(String input) {
        String deliminators = "[ \t,.:;!?\"']+";
        List<String> strList = new ArrayList<>();
        String[] words = input.split(deliminators);         //regex

        for (String word : words) {
            strList.add(word);
        }
        return strList;
    }


    public static String runCommand(String inputStr) {
        List<String> wl;
        String s = "acknowledged";
        String lowerStr = inputStr.trim().toLowerCase();

        if (!lowerStr.equals("q")) {
            if (lowerStr.equals("")) {
                s = "Please enter a command!";

            } else {
                wl = wordList(lowerStr);
                parseCommand(wl);
            }
            return s;
        }
        return s;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader userInput;
        String input;
        String output;

        userInput = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print(">");
            input = userInput.readLine();
            output = runCommand(input);
            System.out.println("You typed '" + input + " ' ");
        } while (!"q".equals(input));
    }


}












