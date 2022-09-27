package com.game.controller;

import com.game.characters.Heroes;
import com.game.characters.HeroesFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Game {
    private Scanner scanner = new Scanner(System.in);
    Heroes hero = HeroesFactory.createHeroes(scanner);

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
            System.out.println("The hero went to the north... Stepped on a banana peel, and fell " +
                    "on their bottom. Ouch...");
            hero.setHp(hero.getHp() - 5);
            System.out.println(hero);
        } else if ("2".equals(userChoice)) {
            System.out.println("The heroes went to the south.");
        }
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












