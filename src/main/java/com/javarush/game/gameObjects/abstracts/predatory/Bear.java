package com.javarush.game.gameObjects.abstracts.predatory;

import com.javarush.game.gameObjects.abstracts.Animal;
import com.javarush.game.gameObjects.abstracts.herbivores.*;

import java.util.Arrays;

public class Bear extends Animal {

    private final String image = "\uD83D\uDC3B";

    private final Animal[] animals =
            {new Boa(), new Horse(), new Deep(), new Rabbit(), new Mouse(), new Goat(),
                    new Sheep(), new Boar(), new Buffalo(), new Duck()};

    public Bear() {
    }

    public Bear(int maxInCell, int speedCell, double weight, double eatUp, int[] whoToEat, int conditionX, int conditionY, int ID) {
        super(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);

    }

    @Override
    public String toString() {
        return "Bear{" +
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
