package com.game.characters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class MonstersFactory {

    // generate a random number [1-3] to select one of the 3 kinds of monsters


    private MonstersFactory(){
    }

    public static Monsters generateMonster(int rand){
        Monsters monster = null;

        if(rand == 1){
            monster = new GiantRat();
            try (BufferedReader br =
                         new BufferedReader(new FileReader("images/giantRat.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(rand == 2){
            monster = new SkeletonKnight();
            try (BufferedReader br =
                         new BufferedReader(new FileReader("images/skeletonKnight.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(rand == 3){
            monster = new Mermaid();
            try (BufferedReader br =
                         new BufferedReader(new FileReader("images/mermaid.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return monster;
    }
}