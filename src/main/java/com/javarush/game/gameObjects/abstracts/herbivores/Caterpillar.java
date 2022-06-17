package com.java.javarush.game.gameObjects.abstracts.herbivores;

import com.java.javarush.game.gameObjects.abstracts.Herbivore;

public class Caterpillar extends Herbivore { // гусеница

     private final String image = "\uD83D\uDC1B";

    public final int[] WHO_TO_EAT = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100};

    private static final int maxInCell = 1000;

    private final int speedCell = 0;

    private double weight = 0.01;

    private int eatUp = 0;

    private int conditionX;

    private int conditionY;

    public Caterpillar() {
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
