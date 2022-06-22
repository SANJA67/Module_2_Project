package com.javarush.game.fabrica;

import com.javarush.game.gameObjects.abstracts.Vegetation;
import com.javarush.game.gameObjects.abstracts.vegetation.Grass;
import com.javarush.game.gameObjects.abstracts.Animal;
import com.javarush.game.gameObjects.abstracts.herbivores.*;
import com.javarush.game.gameObjects.abstracts.predatory.*;

public class DataBase {

    public int[] whoToEat(int operationNumber) {
        return switch (operationNumber) {
            case 1 -> new int[]{0, 0, 0, 0, 0, 10, 15, 60, 80, 60, 70, 15, 10, 40, 0, 0};       //Волк
            case 2 -> new int[]{0, 0, 15, 0, 0, 0, 0, 20, 40, 0, 0, 0, 0, 10, 0, 0};            //Удав
            case 3 -> new int[]{0, 0, 0, 0, 0, 0, 0, 70, 90, 0, 0, 0, 0, 60, 40, 0};            //Лиса
            case 4 -> new int[]{0, 80, 0, 0, 0, 40, 80, 80, 90, 70, 70, 50, 20, 10, 0, 0};      //Медведь
            case 5 -> new int[]{0, 0, 10, 0, 0, 0, 0, 90, 90, 0, 0, 0, 0, 80, 0, 0};            //Орел
            case 6 -> new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100};              //Лошадь
            case 7 -> new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100};              //Олень
            case 8 -> new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100};              //Кролик
            case 9 -> new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 90, 100};             //Мышь
            case 10 -> new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100};             //Коза
            case 11 -> new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100};             //Овца
            case 12 -> new int[]{0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 90, 100};           //Кабан
            case 13 -> new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100};             //Буйвол
            case 14 -> new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 90, 100};            //Утка
            case 15 -> new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100};             //Гусеница
            default -> null;
        };
    }

    public double[] animalParameters(int operationNumber) {
        return switch (operationNumber) {
            case 1 -> new double[]{50, 30, 3, 8};             //Волк
            case 2 -> new double[]{15, 30, 1, 3};             //Удав
            case 3 -> new double[]{8, 30, 2, 2};              //Лиса
            case 4 -> new double[]{500, 5, 2, 80};            //Медведь
            case 5 -> new double[]{6, 20, 3, 1};              //Орел
            case 6 -> new double[]{400, 20, 4, 60};           //Лошадь
            case 7 -> new double[]{300, 20, 4, 50};           //Олень
            case 8 -> new double[]{2, 150, 2, 0.45};          //Кролик
            case 9 -> new double[]{0.05, 500, 1, 0.01};       //Мышь
            case 10 -> new double[]{60, 140, 3, 10};          //Коза
            case 11 -> new double[]{70, 140, 3, 15};          //Овца
            case 12 -> new double[]{400, 50, 2, 50};          //Кабан
            case 13 -> new double[]{700, 10, 3, 100};         //Буйвол
            case 14 -> new double[]{1, 200, 4, 0.15};         //Утка
            case 15 -> new double[]{0.01, 1000, 0, 0};        //Гусеница

            default -> null;
        };

    }

    public Animal allAnimal(String animalName, int maxInCell, int speedCell, double weight, double eatUp,
                            int[] whoToEat, int conditionX, int conditionY, int ID) {
        return switch (animalName) {
            case "Волк" -> new Wolf(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);            //Волк
            case "Удав" -> new Boa(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);             //Удав
            case "Лиса" -> new Fox(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);             //Лиса
            case "Медведь" -> new Bear(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);         //Медведь
            case "Орел" -> new Eagle(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);           //Орел
            case "Лошадь" -> new Horse(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);         //Лошадь
            case "Олень" -> new Deep(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);           //Олень
            case "Кролик" -> new Rabbit(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);        //Кролик
            case "Мышь" -> new Mouse(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);           //Мышь
            case "Коза" -> new Goat(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);            //Коза
            case "Овца" -> new Sheep(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);           //Овца
            case "Кабан" -> new Boar(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);           //Кабан
            case "Буйвол" -> new Buffalo(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);       //Буйвол
            case "Утка" -> new Duck(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID);            //Утка
            case "Гусеница" -> new Caterpillar(maxInCell, speedCell, weight, eatUp, whoToEat, conditionX, conditionY, ID); //Гусеница
            default -> null;
        };

    }

    public Vegetation allVegetation(String animalName, int maxInCell, double weight) {
        return switch (animalName) {
            case "Трава" -> new Grass(maxInCell, weight);            //Трава
            default -> null;
        };
    }

    public double[] vegetationParameters(int operationNumber) {
        return switch (operationNumber) {
            case 1 -> new double[]{1, 200};                          //Трава
            default -> null;
        };
    }
}
