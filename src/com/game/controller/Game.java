package com.game.controller;

import com.game.characters.Heroes;
import com.game.characters.HeroesFactory;

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

    // main loop for keep fighting
    // exit - defeat the monster or killed by the monster

}