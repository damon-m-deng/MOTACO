package com.game.characters;

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

    public void frostBolt(){
        int frostBoltDamage;

        System.out.println("Casting frost bolt");
    }

    @Override
    public void useSpecialAbility(){
        frostBolt();
    }

    void manaShield(){
        System.out.println("Casting mana shield");
    }

    void polymorph(){
        System.out.println("Casting polymorph");
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
        return "Hero Class="+this.getName()+" "+super.getName()+
                ", hp=" + super.getHp() + ", "+
                "mp=" + this.getMp();
    }
}