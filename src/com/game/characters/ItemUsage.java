package com.game.characters;


enum Items {
    TACOS, MOMOS, CHEESE //value of enum TACOS is 10, MOMOS is 20, CHEESE is 30

}

public class ItemUsage {
    public static int getItems(String item) {
        int hpIncrease = 0;
        switch (item) {
            case "TACOS":
                hpIncrease = 10;
                System.out.println("You have eaten TACOS, your HP increases by 10");
                break;
            case "MOMOS":
                hpIncrease = 20;
                System.out.println("You have eaten MOMOS, your HP increases by 20");
                break;
            case "CHEESE":
                hpIncrease = 30;
                System.out.println("You have eaten CHEESE, your HP increases by 30");
                break;
            default:
                hpIncrease = 0;
                break;
        }
        return hpIncrease;
    }

    public static void main(String[] args) {
        System.out.println(getItems("TACOS"));
        System.out.println(getItems("MOMOS"));
        System.out.println(getItems("CHEESE"));
    }
}

