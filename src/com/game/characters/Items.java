package com.game.characters;

import java.util.*;


enum items {
    TACOS, MOMOS, CHEESE //value of enum TACOS is 10, MOMOS is 20, CHEESE is 30

}

public class Items {
    public static int getItems(String item) {
        int hpIncrease = 0;
        switch (item) {
            case "TACOS":
                hpIncrease = 10;
                break;
            case "MOMOS":
                hpIncrease = 20;
                break;
            case "CHEESE":
                hpIncrease = 30;
                break;
            default:
                hpIncrease = 0;
                break;
        }
        return hpIncrease;
    }
}

