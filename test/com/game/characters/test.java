package com.game.characters;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {
    @Test
    public void testMe() {
        System.out.println();
        Wizard wiz = new Wizard();

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
}

