package com.game.characters;

import com.apps.util.Prompter;

import java.util.Scanner;

public abstract class Heroes   {

    private int hp = 100;

    Prompter prompter = new Prompter(new Scanner(System.in));
    private String name = prompter.prompt("Please enter your name: ");

    protected Heroes() {
    }

    public Heroes(String name, int hp) {
        setName(name);
        setHp(hp);
    }

    // Dice: randomly gets a number between 1-6
    public int HeroesDice(){
        return (int) ((Math.random() * 5) + 1);
    }

    public void attack(){

    }

    public void defend(){

    }

    public void eat(){

    }

    public void run(){

    }

    public void useSpecialAbility(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", hp=" + hp ;
    }
}