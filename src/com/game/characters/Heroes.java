package com.game.characters;

public abstract class Heroes {

    private String name;
    public int hp = 50;
    private int attackPower = (int) ((Math.random() * 19) + 1);


    protected Heroes() {
    }

    public Heroes(String name, int hp) {
        setName(name);
        setHp(hp);
    }

    public void useSpecialAbility() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", hp=" + hp;
    }
}