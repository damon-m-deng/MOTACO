package com.game.characters;

import java.util.Scanner;

// Creating a HeroesFactory class with static method

public class HeroesFactory {

    // internal use only, prevents user creating the object
    private HeroesFactory() {

    }

    public static Heroes createHeroes(Scanner scanner) {
        Heroes hero;
        while (true) {
            System.out.println("1 = Wizard");
            System.out.println("2 = Warrior Princess");
            System.out.println("3 = Wayward Knight");

            String userInput = scanner.nextLine();

            if ("1".equals(userInput)) {
                hero = new Wizard();
                break;

            } else if ("2".equals(userInput)) {
                hero = new WarriorPrincess();
                break;

            } else if ("3".equals(userInput)) {
                hero = new WaywardKnight();
                break;

            } else {
                System.out.println("Please select a character by entering '1', '2', or '3'");
            }
        }
        return hero;
    }
}