package com.game.characters;

import java.util.Random;

public class Monsters {
    // the number of rounds for monster's special skill
    private String monsterName = null;
    private int monsterHP = 50;
    private int attackPower = (int) ((Math.random() * 19) + 1);

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

    public void useSpecialAbility() {

    }
}