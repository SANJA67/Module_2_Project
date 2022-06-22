package com.javarush.game.island;


import com.javarush.game.gameObjects.abstracts.Animal;

import java.util.List;

public class PlayingField {

    private int a;

    private int b;

    public PlayingFieldCell[][] field;

    public PlayingField(int a, int b) {
        this.a = a;
        this.b = b;
        this.field = new PlayingFieldCell[a][b];

    }

    public void superMethod()  {
        List<Animal> animalCell = field[0][0].animalCell;
        for (int i = 0; i < 1; i++) {
            animalCell.get(0).eat(animalCell.get(i), field[0][0].animalCell);
        }

        //printCell(0, 0);

        //for (Animal animal : field[0][0].animalCell) {
         //   field[0][0].get(1).eat(animal, field[0][0].animalCell);
        //}
        /*for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (Animal animal : field[i][j].animalCell) {
                    animal.eat(animal, field[i][j].animalCell);
                }
            }
        }*/
    }

    public void printCell (int cellX, int cellY) {
        List<Animal> animalCell = field[cellX][cellX].animalCell;
        for (Animal animal : animalCell) {
            for (int j = 0; j < 10; j++) {
                System.out.print(animal.getClass().toString());
            }
            System.out.println();
        }

    }
}
