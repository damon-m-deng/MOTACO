package com.game.controller;

import com.game.characters.Heroes;
import com.game.characters.HeroesFactory;

import java.util.Scanner;

class GameController {
    public static void main(String[] args) {
        // prompt user to select a class, then create a hero based on user input
        Scanner scanner = new Scanner(System.in);
        Heroes hero = HeroesFactory.createHeroes(scanner);
        System.out.println(hero);
    }
}