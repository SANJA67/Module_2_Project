package com.java.javarush.game.island;

import com.java.javarush.game.gameObjects.abstracts.Animal;

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
        for (Animal animal : field[0][0].animalCell) {
            animal.eat(animal, field[0][0].animalCell);
        }
        /*for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (Animal animal : field[i][j].animalCell) {
                    animal.eat(animal, field[i][j].animalCell);
                }
            }
        }*/
    }
}
