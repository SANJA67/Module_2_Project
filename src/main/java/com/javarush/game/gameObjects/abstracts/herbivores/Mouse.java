package com.javarush.game.gameObjects.abstracts.herbivores;

import com.javarush.game.gameObjects.abstracts.Animal;

import java.util.Arrays;

public class Mouse extends Animal {

    private final String image = "\uD83D\uDC01";

    private final Animal[] animals = {new Caterpillar()};

    public Mouse() {
    }

    public Mouse(int maxInCell, int speedCell, double weight, double eatUp, int[] whoToEat, int conditionX, int conditionY, int ID) {
        super(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);

    }

    @Override
    public String toString() {
        return "Mouse{" +
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
