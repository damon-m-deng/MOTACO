package com.game.characters;

public class WaywardKnight extends Heroes {
    private int energy = 100;
    private Heroes heroes;

    public WaywardKnight() {

    }

    public WaywardKnight(String name, int age, int hp, int energy) {
        super(name, hp);
        setEnergy(energy);
    }

    public void shredClassicalGuitar() {
        System.out.println("Shredding classical guitar and enemies are stunned");
    }

    public void standardSwordAttacks() {
        System.out.println("Slice and dice with in the standard fashion as one does");
    }

    public void shieldSmash() {
        System.out.println("Smash the enemy with your shield, like a cheap version of the hulk");
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}