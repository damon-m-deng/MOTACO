package com.game.characters;

import java.util.Random;

public class Monsters {
    // the number of rounds for monster's special skill
    private int duration;

    // Dice: randomly gets a number between 1-6
    public int monstersDice(){
        return (int) ((Math.random() * 5) + 1);
    }
}