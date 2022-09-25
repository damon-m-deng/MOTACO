package com.game.characters;

public abstract class Heroes   {
    private String name;
    private int age;
    private int hp;

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
}