package com.javarush.game.gameObjects.transformation;

import com.javarush.game.gameObjects.abstracts.Animal;
import com.javarush.game.gameObjects.abstracts.predatory.Fox;
import com.javarush.game.gameObjects.abstracts.predatory.Wolf;

public class ObjectType {

    public static Wolf returnObjectWolf(Animal animal) {

        if (animal instanceof Wolf) {

            Wolf wolf = (Wolf) animal;

            return wolf;
        }

        return null;
    }

    public static Fox returnObjectFox(Animal animal) {

        if (animal instanceof Fox) {

            Fox fox = (Fox) animal;

            return fox;
        }

        return null;
    }
}
