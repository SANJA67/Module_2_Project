package com.javarush.game.gameObjects.abstracts.herbivores;

import com.javarush.game.gameObjects.abstracts.Animal;

import java.util.Arrays;

public class Goat extends Animal {

    private final String image = "\uD83D\uDC10";

    private final Animal[] animals = {};

    public Goat() {
    }

    public Goat(int maxInCell, int speedCell, double weight, double eatUp, int[] whoToEat, int conditionX, int conditionY, int ID) {
        super(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);

    }

    @Override
    public String toString() {
        return "Goat{" +
                "image='" + image + '\'' +
                ", maxInCell=" + maxInCell +
                ", speedCell=" + speedCell +
                ", weight=" + weight +
                ", eatUp=" + eatUp +
                ", whoToEat=" + Arrays.toString(whoToEat) +
                ", conditionX=" + conditionX +
                ", conditionY=" + conditionY +
                '}';
    }

    public String getImage() {
        return image;
    }

    public Animal[] getAnimals() {
        return animals;
    }
}
