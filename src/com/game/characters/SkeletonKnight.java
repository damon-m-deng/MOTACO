package com.game.characters;

class SkeletonKnight extends Monsters{
    private final String name = "SkeletonKnight";
    private int hp = 150;
    // rage: get generated by 10 with getting attacked
    private int rage = 10;
    private int attack = 10;

    // skills
    void fear() {
        if (rage >= 5) {
            hp += 10;
            rage -= 15;
        }
    }

    void femurStab() {
        if (rage >= 5) {
            hp += 30;
            rage -= 20;
        }
    }

    @Override
    public void useSpecialAbility(){

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String getName() {
        return name;
    }
}