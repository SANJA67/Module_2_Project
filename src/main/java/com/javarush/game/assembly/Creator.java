package com.javarush.game.assembly;


import com.javarush.game.fabrica.DataBase;
import com.javarush.game.fabrica.EntityFactory;
import com.javarush.game.gameObjects.abstracts.Vegetation;
import com.javarush.game.gameObjects.abstracts.Animal;
import com.javarush.game.island.PlayingField;
import com.javarush.game.island.PlayingFieldCell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Creator {


    public void start() {

        DataBase dataBase = new DataBase();

        EntityFactory entityFactory = new EntityFactory();

        Random random = new Random();

        PlayingField playingField = new PlayingField(5, 10);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {

                playingField.field[i][j] =
                        new PlayingFieldCell(i, j,
                                creatorAnimal(entityFactory, random, i, j, dataBase),
                                creatorVegetation(entityFactory, random, dataBase));

            }
        }
        playingField.superMethod();
    }

    public List<Vegetation> creatorVegetation(EntityFactory entityFactory, Random random, DataBase dataBase) {

        String[] vegatation = {"Трава"};

        List<Vegetation> vegetationlInCell = new ArrayList<>();

        for (int i = 0; i < vegatation.length; i++) {

            int numberObjects = random.nextInt((int) (dataBase.vegetationParameters(i + 1)[1] + 1));

            for (int j = 0; j < numberObjects; j++) {

                vegetationlInCell.add(entityFactory.readyVegetation(vegatation[i], i + 1, dataBase));
            }
        }
        return vegetationlInCell;
    }

    public List<Animal> creatorAnimal(EntityFactory entityFactory, Random random, int conditionX, int conditionY, DataBase dataBase) {

        String[] animals = {"Волк", "Удав", "Лиса", "Медведь", "Орел", "Лошадь", "Олень", "Кролик", "Мышь", "Коза",
                "Овца", "Кабан", "Буйвол", "Утка", "Гусеница"};


        List<Animal> animalInCell = new ArrayList<>();
        for (int i = 0; i < animals.length; i++) {

            int numberObjects = random.nextInt((int) (dataBase.animalParameters(i + 1)[1] + 1));

            for (int j = 0; j < numberObjects; j++) {

                animalInCell.add(entityFactory.readyAnimal(animals[i], i + 1, conditionX, conditionY, dataBase));
            }
        }
        Collections.shuffle(animalInCell);
        return animalInCell;
    }
}
