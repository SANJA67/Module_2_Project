package com.javarush.game.island;

import com.javarush.game.gameObjects.abstracts.Vegetation;
import com.javarush.game.gameObjects.abstracts.Animal;

import java.util.List;

public class PlayingFieldCell {
    int cellX;
    int cellY;
    List<Animal> animalCell;
    List<Vegetation> grassCell;

    public PlayingFieldCell(int cellX, int cellY, List<Animal> animalCell, List<Vegetation> grassCell) {
        this.cellX = cellX;
        this.cellY = cellY;
        this.animalCell = animalCell;
        this.grassCell = grassCell;
    }
}
