package com.game.characters;

import com.apps.util.SplashApp;

class Wizard extends Heroes {

    private int mp;
    private Heroes heroes;

    public Wizard() {

    }

    public Wizard(String name, int age, int hp, int mp) {
        super(name, age, hp);
        setMp(mp);
    }

    public void frostBolt(){
        System.out.println("Casting frost bolt");
    }

    public void manaShield(){
        System.out.println("Casting mana shield");
    }

    public void polymorph(){
        System.out.println("Casting polymorph");
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}