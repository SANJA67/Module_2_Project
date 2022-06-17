package com.java.javarush.game.gameObjects.abstracts;

import com.java.javarush.game.gameObjects.abstracts.predatory.Bear;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public abstract class Animal implements Cloneable {
    public int maxInCell;

    public Animal(int maxInCell) {
        this.maxInCell = maxInCell;
    }

    @Override
    public Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }

    public void eat(Animal animal, List<Animal> animalCell) {
        Class cl = animal.getClass();
        Method ints;
        try {
            ints = cl.getMethod("getWHO_TO_EAT");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        int[] i;
        try {
            i = (int[]) ints.invoke(animal);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j] + " ");
        }
    }

    public void walk(Animal animal) {
        if (animal instanceof Bear) {
            Object bear = null;
            ((Bear) bear).getSpeedCell();

        }
    }

    public void multiply(Animal animal, List<Animal> animalCell) {
        if (animal instanceof Bear) {

        }
    }
}
