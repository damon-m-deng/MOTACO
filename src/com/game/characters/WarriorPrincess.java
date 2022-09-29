package com.game.characters;

import java.util.Scanner;

public class WarriorPrincess extends Heroes {

    private int rage = 200;
    private int attack = 10;
    private final String name = "Warrior Princess";

    // constructor
    public WarriorPrincess() {
        super();
    }

    public WarriorPrincess(String name, int hp, int rage) {
        super(name, hp);
        this.rage= rage;
    }

    // generate HP by consuming rage
    void heal() {
        System.out.println("The Warrior Princess casts the spell: Heal, her HP increases by 20.");
        if(rage > 50){
            this.setHp(this.getHp()+20);
            rage = rage - 50;
        }
        else{
            System.out.println("Not enough rage");
        }
    }

    // increase attack power by 100%
    void enrage() {
        System.out.println("The Warrior Princess is now enraged, her damage increases by 100%.");
        int enragedDamage = getAttackPower() *2;
        setAttackPower(enragedDamage);
        if (rage > 20) {
            rage = rage - 20;
        } else {
            System.out.println("Not enough rage...");
        }
    }

    void decreaseDamageTaken() {

    }

    @Override
    public void useSpecialAbility(){
        while(true) {
            System.out.println("What Wizard skill you would like to use?");
            System.out.println("1: Heal. Warrior Princess will heal her wound.");
            System.out.println("2. Enrage. Warrior Princess will enter the berserk mode to create more damage.");
            System.out.println("Warrior Princess Rage = "+ getRage());
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if ("1".equals(userInput)) {
                heal();
                break;
            } else if ("2".equals(userInput)) {
                enrage();
                break;
            } else {
                System.out.println("please select a skill, [1/2]");
            }
        }
    }

    // accessor methods
    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    public String getName() {
        return name;
    }

    String getHeroClass() {
        return name;
    }

    @Override
    public String toString() {
        return "Hero Class=" + this.getHeroClass() + super.getName() +
                ", hp=" + super.getHp() + ", " +
                "mp=" + this.getRage();
    }
}
