package com.java.javarush.game.assembly;

import com.java.javarush.game.gameObjects.Grass;
import com.java.javarush.game.gameObjects.abstracts.Animal;
import com.java.javarush.game.gameObjects.abstracts.herbivores.Boar;
import com.java.javarush.game.gameObjects.abstracts.herbivores.Buffalo;
import com.java.javarush.game.gameObjects.abstracts.herbivores.Caterpillar;
import com.java.javarush.game.gameObjects.abstracts.predatory.Bear;
import com.java.javarush.game.gameObjects.abstracts.predatory.Boa;
import com.java.javarush.game.gameObjects.abstracts.predatory.Fox;
import com.java.javarush.game.island.PlayingField;
import com.java.javarush.game.island.PlayingFieldCell;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Creator {

    Random random = new Random();

    public void start() throws CloneNotSupportedException {
        PlayingField playingField = new PlayingField(5, 10);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                playingField.field[i][j] =
                        new PlayingFieldCell(i, j, creatorAnimal(), creatorGrass());
            }
        }
        playingField.superMethod();
    }

    public List<Grass> creatorGrass() throws CloneNotSupportedException {

        List<Grass> animalInCell = new ArrayList<>();
        Grass grass = new Grass();
        int numberObjects = (random.nextInt(grass.getMaxInCell())) + 1;
        for (int j = 0; j < numberObjects; j++) {

                animalInCell.add(grass.clone());

            }
        /*for (Grass a: animalInCell) {
            System.out.println(a);
        }*/
        return animalInCell;
    }

    public List<Animal> creatorAnimal() throws CloneNotSupportedException {

        List<Animal> animalInCell = new ArrayList<>();
        List<Animal> animalList = allAnimal();

        for (int i = 0; i < animalList.size(); i++) {
            int numberObjects = (random.nextInt(animalList.get(i).maxInCell)) + 1;
            for (int j = 0; j < numberObjects; j++) {

                animalInCell.add(animalList.get(i).clone());

            }
        }

        /*for (Animal a: animalInCell) {
            System.out.println(a);
        }*/

        return animalInCell;
    }

    public List<Animal> allAnimal() {
        List<Animal> animals;
        animals = new ArrayList<>();
        animals.add(new Bear());
        animals.add(new Boa());
        //animals.add(new Eagle());
        animals.add(new Fox());
        //animals.add(new Wolf());
        animals.add(new Boar());
        animals.add(new Buffalo());
        animals.add(new Caterpillar());
        //animals.add(new Deer());
        //animals.add(new Duck());
        //animals.add(new Goat());
        //animals.add(new Horse());
        //animals.add(new Mouse());
        //animals.add(new Rabbit());
        //animals.add(new Sheep());

        return animals;
    }
}
