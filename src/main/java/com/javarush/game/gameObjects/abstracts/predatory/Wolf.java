package com.javarush.game.gameObjects.abstracts.predatory;

import com.javarush.game.gameObjects.abstracts.Animal;
import com.javarush.game.gameObjects.abstracts.herbivores.*;

import java.util.Arrays;

public class Wolf extends Animal {

    public int ate;
    private final Animal[] animals =
            {new Horse(), new Deep(), new Rabbit(), new Mouse(), new Goat(),
                    new Sheep(), new Boar(), new Buffalo(), new Duck()};
    private final String image = "\uD83D\uDC3A";

    public Wolf() {
    }

    public Wolf(int maxInCell, int speedCell, double weight, double eatUp,
                int[] whoToEat, int conditionX, int conditionY, int ID) {
        super(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);

    }

    @Override
    public String toString() {
        return "Wolf{" +
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
