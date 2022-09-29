package com.game.characters;

import java.util.Scanner;

public class UserFactory {

    private UserFactory() {

    }

    public static User createUser(Scanner scanner) { //TODO: what is scanner doing here??
        return new User();
    }
}
