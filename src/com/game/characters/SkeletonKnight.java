package com.game.characters;

class SkeletonKnight extends Monsters {
    private final String name = "SkeletonKnight";
    // rage: get generated by 10 with getting attacked
    private int rage = 10;

    @Override
    public String getName() {
        return name;
    }
}