package com.game.characters;

import com.apps.util.Prompter;

import java.util.Scanner;

// Creating a HeroesFactory class with static method

public class HeroesFactory {

    // internal use only, prevents user creating the object
    private HeroesFactory(){

    }

    public static Heroes createHeroes(Scanner scanner){
        Heroes hero = null;

        System.out.println("Welcome: ");
        System.out.println("Please select your Character: ");
        System.out.println("1 = Wizard");
        System.out.println("2 = Warrior (N/A)");
        System.out.println("3 = Knight (N/A)");

        if("1".equals(scanner.nextLine())){
            hero = new Wizard();
        }

        // TODO: add other classes here, such as 2, 3...

        return hero;
    }
}