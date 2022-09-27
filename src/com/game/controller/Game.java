package com.game.controller;

import com.game.characters.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    Heroes hero = HeroesFactory.createHeroes(scanner);

    public void playerSetUp(){
        System.out.println("Hello "+hero.getName()+". Let's start the game!");
    }

    // first mission
    public void firstMission(){
        System.out.println("You stepped out the gate of your village. What do you do?");
        System.out.println("1. Go North.");
        System.out.println("2. Go South.");

        String userChoice = scanner.nextLine();
        if("1".equals(userChoice)){
            System.out.println("The hero went to the north... Stepped on a banana peel, and fell on their bottom. Ouch...");
            hero.setHp(hero.getHp()-5);
            System.out.println(hero);
        }
        else if("2".equals(userChoice)){
            System.out.println("The heroes went to the south.");
        }
    }

/*
 * Classic Main Loop
 */

    public static void main(String[] args) throws IOException {
        BufferedReader userInput;
        String input;

        userInput = new BufferedReader (new InputStreamReader(System.in));
        do {
            System.out.print(">");
            input = userInput.readLine();
            System.out.println("You entered '" + input + " ' ");
        }   while (input != "q");
    }

}