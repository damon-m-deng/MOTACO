package com.game.characters;

import java.util.Scanner;

public class WaywardKnight extends Heroes {
    private int energy = 100;
    private Heroes heroes;
    private final String name = "Wayward Knight";

    public WaywardKnight() {

    }

    public WaywardKnight(String name, int age, int hp, int energy) {
        super(name, hp);
        setEnergy(energy);
    }

    @Override
    public void useSpecialAbility() {
        while (true) {
            System.out.println("What Wayward Knight skill you would like to use?");
            System.out.println("1: Shred Classical Guitar: Mesmerize the enemy with your guitar " +
                    "skills and increase your attack damage by 1.5x");
            System.out.println("2. Shield Smash: Smash your enemy and multiply your attack damage" +
                    " by 1.3x");
            System.out.println("Wayward Knight energy = " + getEnergy());
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if ("1".equals(userInput)) {
                shredClassicalGuitar();
                break;
            } else if ("2".equals(userInput)) {
                shieldSmash();
                break;
            } else {
                System.out.println("please select a skill, 1 or 2");
                System.out.println();
            }
        }

    }

    public void shredClassicalGuitar() {
        System.out.println("Shredding classical guitar and enemies are stunned");
        int shreddingDamage = (int) (getAttackPower() * 1.5);
        System.out.println("The damage is increased by a multiple of 1.5 " + shreddingDamage);
        System.out.println();
        setAttackPower(shreddingDamage);
        if (energy > 20) {
            energy = energy - 20;
        } else {
            System.out.println("Not enough energy...");
        }

    }

    public void shieldSmash() {
        System.out.println("Smash the enemy with your shield, like a cheap version of the hulk");
        int shieldDamage = (int) (getAttackPower() * 1.3);
        System.out.println("The attack power is increased by a multiple of 1.3 to " + shieldDamage);
        System.out.println();


        setAttackPower(shieldDamage);
        if (energy > 30) {
            energy = energy - 30;
        } else {
            System.out.println("Not enough energy...");
        }
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getName() {
        return name;
    }
}
