package com.game.characters;

class Wizard extends Heroes {

    private int mp = 100;
    private int attack = 5;
    private String heroClass = "Wizard";

    protected Wizard() {

    }

    protected Wizard(String name, int hp, int mp) {
        super(name, hp);
        setMp(mp);
    }

    void frostBolt(){
        int frostBoltDamage;

        System.out.println("Casting frost bolt");
    }

    void manaShield(){
        System.out.println("Casting mana shield");
    }

    void polymorph(){
        System.out.println("Casting polymorph");
    }

    int getMp() {
        return mp;
    }

    void setMp(int mp) {
        this.mp = mp;
    }

    String getHeroClass() {
        return heroClass;
    }

    @Override
    public String toString() {
        return "Hero Class="+this.getHeroClass()+super.getName()+
                ", hp=" + super.getHp() + ", "+
                "mp=" + this.getMp();
    }
}