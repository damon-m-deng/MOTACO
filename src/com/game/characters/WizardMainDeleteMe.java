package com.game.characters;

import com.apps.util.Prompter;

import java.util.Scanner;

class WizardMainDeleteMe {
    public static void main(String[] args) {
        Wizard wiz = new Wizard("Damon", 40, 100, 100);
        Prompter prompter = new Prompter(new Scanner(System.in));
        String name = prompter.prompt("Please enter your name: ");
        String age  = prompter.prompt("Please enter your age:  ", "\\d+", "That is not a valid age!");
    }
}