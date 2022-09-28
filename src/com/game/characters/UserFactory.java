package com.game.characters;

import java.util.Scanner;

public class UserFactory {

    private UserFactory() {

    }

    public static User createUser(Scanner scanner) {
        return new User();
    }
}
