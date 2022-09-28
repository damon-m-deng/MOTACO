package com.game.controller;

import com.apps.util.Console;
import com.game.characters.Heroes;
import com.game.characters.HeroesFactory;

import java.util.Scanner;

class GameController {
    public static void main(String[] args) {
        Console.clear();        //added console clear but need to use actual terminal
        Game game = new Game();
        game.start();
    }
}   