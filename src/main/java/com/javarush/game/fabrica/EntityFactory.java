package com.javarush.game.fabrica;

import com.javarush.game.gameObjects.abstracts.Animal;
import com.javarush.game.gameObjects.abstracts.Vegetation;
import com.javarush.game.gameObjects.abstracts.vegetation.Grass;

public class EntityFactory {

    public Vegetation readyVegetation(String animalName, int ID, DataBase dataBase) {

        double[] animalParameters = dataBase.animalParameters(ID);

        return dataBase.allVegetation(animalName, (int) animalParameters[1], animalParameters[0]);
    }

    public Animal readyAnimal(String animalName, int ID, int conditionX, int conditionY, DataBase dataBase) {

        double[] animalParameters = dataBase.animalParameters(ID);

        int[] whoToEat = dataBase.whoToEat(ID);

        return dataBase.allAnimal(animalName, (int) animalParameters[1], (int) animalParameters[2], animalParameters[0],
                animalParameters[3],
                whoToEat, conditionX, conditionY, ID);
    }


}
