package com.javarush.game.gameObjects.abstracts;

public abstract class Vegetation {

    public int maxInCell;

    public double weight;

    public Vegetation(int maxInCell, double weight) {
        this.maxInCell = maxInCell;
        this.weight = weight;
    }
}
