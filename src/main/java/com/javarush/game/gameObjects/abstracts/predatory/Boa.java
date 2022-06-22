package com.javarush.game.gameObjects.abstracts.predatory;

import com.javarush.game.gameObjects.abstracts.Animal;
import com.javarush.game.gameObjects.abstracts.herbivores.*;

import java.util.Arrays;

public class Boa extends Animal { // Удав

    private final String image = "\uD83D\uDC0D";

    private final Animal[] animals =
            {new Fox(), new Rabbit(), new Mouse(), new Duck()};

    public Boa() {
    }

    public Boa(int maxInCell, int speedCell, double weight, double eatUp, int[] whoToEat, int conditionX, int conditionY, int ID) {
        super(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);

    }

    @Override
    public String toString() {
        return "Boa{" +
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

