package com.game.controller;

public class AsciiFactory {
    private AsciiFactory() {}

    public static AsciiGen createAscii(){
        return new AsciiGen();
    }
}
