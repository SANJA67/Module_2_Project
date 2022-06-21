package com.javarush.game.gameObjects.abstracts.vegetation;

import com.javarush.game.gameObjects.abstracts.Vegetation;

public class Grass extends Vegetation {

    private final String image = "\uD83C\uDF3F";

    public Grass(int maxInCell, double weight) {
        super(maxInCell, weight);
    }

    @Override
    public String toString() {
        return "Grass{" +
                "image='" + image + '\'' +
                ", maxInCell=" + maxInCell +
                ", weight=" + weight +
                '}';
    }
}
