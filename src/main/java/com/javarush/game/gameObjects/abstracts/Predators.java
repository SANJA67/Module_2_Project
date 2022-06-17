package com.java.javarush.game.gameObjects.abstracts;

public abstract class Predators extends Animal{
    public int maxInCell;
    public Predators(int maxInCell) {
        super(maxInCell);
    }
}
