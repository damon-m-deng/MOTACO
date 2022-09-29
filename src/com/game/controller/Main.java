package com.game.controller;

import com.apps.util.Console;

class Main {
    public static void main(String[] args) {
        Console.clear();        //added console clear but need to use actual terminal
        GameController game = new GameController();
        System.out.println();
        Console.pause(1000);
        game.start();

    }
}