package com.java.javarush.game.gameObjects.abstracts.predatory;

import com.java.javarush.game.gameObjects.abstracts.Predators;

public class Fox extends Predators {

    private final String image = "\uD83E\uDD8A";

    public final int[] WHO_TO_EAT = new int[]{0, 0, 15, 0, 0, 0, 0, 20, 40, 0, 0, 0, 0, 10, 0, 0};

    private static final int maxInCell = 30;

    private final int speedCell = 2;

    private double weight = 8;

    private int eatUp = 2;

    private int conditionX;

    private int conditionY;

    public Fox() {
        super(maxInCell);   // private final int maxInCell = 5;

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
