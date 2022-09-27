package com.game.characters;

class WarriorPrincess extends Heroes {

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

    // methods
    void increaseHp() {
        this.setHp(this.getHp()+20);
        rage = rage - 50;
    }

    void increaseDamage() {

    }

    void decreaseDamageTaken() {

    }

    @Override
    public void useSpecialAbility(){
        increaseHp();
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
