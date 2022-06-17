package com.java.javarush.game.gameObjects.abstracts.herbivores;

import com.java.javarush.game.gameObjects.abstracts.Herbivore;

public class Boar extends Herbivore{
    private final String image = "\uD83D\uDC17";

    public final int[] WHO_TO_EAT = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 90, 100};

    private static final int maxInCell = 50;

    private final int speedCell = 2;

    private double weight = 400;

    private int eatUp = 50;

    private int conditionX;

    private int conditionY;

    public Boar() {
        super(maxInCell);   // private final int maxInCell = 30;

    }

    @Override
    public String toString() {
        return image;
    }

    public String getImage() {
        return image;
    }

    public int[] getWHO_TO_EAT() {
        return WHO_TO_EAT;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxInCell() {
        return maxInCell;
    }

    public int getSpeedCell() {
        return speedCell;
    }

    public int getEatUp() {
        return eatUp;
    }

    public void setEatUp(int eatUp) {
        this.eatUp = eatUp;
    }

    public int getConditionX() {
        return conditionX;
    }

    public void setConditionX(int conditionX) {
        this.conditionX = conditionX;
    }

    public int getConditionY() {
        return conditionY;
    }

    public void setConditionY(int conditionY) {
        this.conditionY = conditionY;
    }
}
