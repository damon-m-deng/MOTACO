package com.game.characters;

import java.util.Random;

public class Monsters {
    // the number of rounds for monster's special skill
    private int duration;
    private String monsterName = null;
    private int monsterHP = 100;
    private int attackPower = (int) ((Math.random() * 9) + 1);

    // Dice: randomly gets a number between 1-6
    public int monstersDice(){
        return (int) ((Math.random() * 5) + 1);
    }

    public void attack(){

    }

    public void useSpecialAbility(){

    }

    public String getName() {
        return monsterName;
    }

    public int getMonsterHP() {
        return monsterHP;
    }

    public void setMonsterHP(int monsterHP) {
        this.monsterHP = monsterHP;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}