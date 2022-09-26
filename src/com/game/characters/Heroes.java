package com.game.characters;

import com.apps.util.Prompter;

import java.util.Scanner;

public abstract class Heroes   {

    private int hp = 100;

    Prompter prompter = new Prompter(new Scanner(System.in));
    private String name = prompter.prompt("Please enter your name: ");
    private String userInputAge  = prompter.prompt("Please enter your age:  ", "\\d+", "That is not a valid age!");
    private int age = Integer.parseInt(userInputAge);

    public Heroes() {
    }

    public Heroes(String name, int age, int hp) {
        setName(name);
        setAge(age);
        setHp(hp);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                ", age=" + age +
                ", hp=" + hp ;
    }
}