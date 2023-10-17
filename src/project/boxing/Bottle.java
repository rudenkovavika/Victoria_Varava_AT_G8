package project.boxing;

import project.water.Water;

public class Bottle {
    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
    }

    public void open() {

        //который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened();)
    }

    public void warm(int temperature) {
        System.out.printf("Warming water to: %s", temperature).println();

        //который устанавливает температуру воды в бутылке
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void setBubbles() {

        //который генерирует массив из обьектов Bubble размерностью 10 тыс пузырьков
        //на 1 литр воды и сетает его в воду
    }
}