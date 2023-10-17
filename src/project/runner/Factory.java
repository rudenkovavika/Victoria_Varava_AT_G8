package project.runner;

import project.boxing.Bottle;

public class Factory {
    public static void main(String[] args) {

        Bottle bottle = new Bottle();

        Bottle bottle1 = new Bottle();
        bottle1.volume(0.05);

        Bottle bottle2 = new Bottle();
        bottle2.volume(0.1);

        Bottle bottle3 = new Bottle();
        bottle3.volume(0.2);


        //бутылки с газировкой, температура которой 12, 18 и 25 градусов соответственно
        //------ добавить газировку в бутылки и наполнить пузырьками

        bottle1.open();
        bottle2.open();
        bottle3.open();
    }
}