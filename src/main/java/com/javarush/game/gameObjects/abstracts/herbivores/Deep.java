package com.javarush.game.gameObjects.abstracts.herbivores;

import com.javarush.game.gameObjects.abstracts.Animal;

import java.util.Arrays;

public class Deep extends Animal {

    private final Animal[] animals = {};

    private final String image = "\uD83E\uDD8C";

    public Deep() {
    }

    public Deep(int maxInCell, int speedCell, double weight, double eatUp, int[] whoToEat, int conditionX, int conditionY, int ID) {
        super(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);

    }

    @Override
    public String toString() {
        return "Deep{" +
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

    public Animal[] getAnimals() {
        return animals;
    }

    public String getImage() {
        return image;
    }
}
