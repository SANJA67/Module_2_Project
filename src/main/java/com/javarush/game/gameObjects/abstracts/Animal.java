package com.javarush.game.gameObjects.abstracts;

import com.javarush.game.gameObjects.abstracts.predatory.Bear;

import java.util.List;
import java.util.Random;

public abstract class Animal {

    public int maxInCell;

    public int speedCell;

    public double weight;

    public double eatUp;

    public int[] whoToEat;

    public int conditionX;

    public int conditionY;

    public int ID;

    public Animal() {
    }

    public Animal(int maxInCell, int speedCell, double weight, double eatUp, int[] whoToEat, int conditionX, int conditionY, int ID) {
        this.maxInCell = maxInCell;
        this.speedCell = speedCell;
        this.weight = weight;
        this.eatUp = eatUp;
        this.whoToEat = whoToEat;
        this.conditionX = conditionX;
        this.conditionY = conditionY;
        this.ID = ID;
    }


    public void eat(Animal animal, List<Animal> animalCell) {
        Random random = new Random();
        Animal animalNumber = animalCell.get(random.nextInt(animalCell.size()));

        if(animal.whoToEat[animalNumber.ID] != 0 && random.nextInt(100) < animal.whoToEat[animalNumber.ID]) {

        }





        for (int i = 0; i < animal.whoToEat.length; i++) {

        }

    }

    public void walk(Animal animal) {
        if (animal instanceof Bear) {
            Object bear = null;


        }
    }

    public void multiply(Animal animal, List<Animal> animalCell) {
        if (animal instanceof Bear) {

        }
    }
}
