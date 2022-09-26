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

        System.out.print("Please select your Character: 1=Wizard...");

        if("1".equals(scanner.nextLine())){
            hero = new Wizard();
        }

        // TODO: add other classes here, such as 2, 3...

        return hero;
    }
}