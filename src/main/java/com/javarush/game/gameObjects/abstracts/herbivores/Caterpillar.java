package com.javarush.game.gameObjects.abstracts.herbivores;

import com.javarush.game.gameObjects.abstracts.Animal;

import java.util.Arrays;

public class Caterpillar extends Animal { // гусеница

    private final Animal[] animals = {};

    private final String image = "\uD83D\uDC1B";

    public Caterpillar() {
    }

    public Caterpillar(int maxInCell, int speedCell, double weight, double eatUp, int[] whoToEat, int conditionX, int conditionY, int ID) {
        super(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);

    }

    @Override
    public String toString() {
        return "Caterpillar{" +
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



