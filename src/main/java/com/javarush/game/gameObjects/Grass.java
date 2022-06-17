package com.java.javarush.game.gameObjects;


import com.java.javarush.game.gameObjects.abstracts.Animal;

public class Grass implements Cloneable{

    private String image = "\uD83C\uDF3F";

    private int maxInCell = 200;

    private int weight = 1;

    private int conditionX;

    private int conditionY;


    @Override
    public String toString() {
        return image;
    }

    @Override
    public Grass clone() throws CloneNotSupportedException {
        return (Grass) super.clone();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getMaxInCell() {
        return maxInCell;
    }

    public void setMaxInCell(int maxInCell) {
        this.maxInCell = maxInCell;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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
