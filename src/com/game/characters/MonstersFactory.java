package com.game.characters;

import java.util.Random;

public class MonstersFactory {

    // generate a random number [1-3] to select one of the 3 kinds of monsters
    private int r = (int) ((Math.random() * 2) + 1);

    private MonstersFactory(){
    }

    public static Monsters generateMonster(int rand){
        Monsters monster = null;

        if(rand == 1){
            monster = new GiantRat();
        }
        else if(rand == 2){
            monster = new SkeletonKnight();
        }
        else if(rand == 3){
            monster = new Mermaid();
        }

        return monster;
    }
}