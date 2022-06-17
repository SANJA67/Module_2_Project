package com.java.javarush.game.island;

import com.java.javarush.game.gameObjects.Grass;
import com.java.javarush.game.gameObjects.abstracts.Animal;

import java.util.List;

public class PlayingFieldCell {
    int cellX;
    int cellY;
    List<Animal> animalCell;
    List<Grass> grassCell;

    public PlayingFieldCell(int cellX, int cellY, List<Animal> animalCell, List<Grass> grassCell) {
        this.cellX = cellX;
        this.cellY = cellY;
        this.animalCell = animalCell;
        this.grassCell = grassCell;
    }
}
