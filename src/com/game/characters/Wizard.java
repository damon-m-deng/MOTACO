package com.game.characters;

import java.util.Scanner;

public class Wizard extends Heroes {

    private int mp = 100;
    private int attack = 5;
    private final String name = "Wizard";

    protected Wizard() {

    }

    protected Wizard(String name, int hp, int mp) {
        super(name, hp);
        setMp(mp);
    }

    @Override
    public void useSpecialAbility() {
        while(true) {
            System.out.println("What Wizard skill you would like to use?");
            System.out.println("1: Frost Bolt");
            System.out.println("2. Mana Shield");
            System.out.println("Wizard mana = "+ getMp());
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if ("1".equals(userInput)) {
                frostBolt();
                break;
            } else if ("2".equals(userInput)) {
                manaShield();
                break;
            } else {
                System.out.println("please select a skill, [1/2]");
            }
        }
    }

    private void frostBolt() {
        System.out.println("The Wizard casts the spell: frost bolt, the damage increases by 150%.");
        int frostBoltDamage = (int)(getAttackPower() *2.5);
        setAttackPower(frostBoltDamage);
        if (mp > 20) {
            mp = mp - 20;
        } else {
            System.out.println("Not enough mana...");
        }
    }

    void manaShield() {
        System.out.println("The Wizard casts the spell: manaShield. The wizard gained a shield");
        int shield = this.getMp();
        if (mp > 30) {
            hp = hp+shield;
            mp = mp - 30;
        } else {
            System.out.println("Not enough mana...");
        }
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hero Class=" + this.getName() + " " + super.getName() +
                ", hp=" + super.getHp() + ", " +
                "mp=" + this.getMp();
    }
}