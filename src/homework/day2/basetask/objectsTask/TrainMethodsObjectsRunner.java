package homework.day2.basetask.objectsTask;

import homework.day2.basetask.objectsTask.*;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        trainMethodsObjects.processMouse(new Mouse("Микки", 3));
        trainMethodsObjects.processSouce(new Souce("Кетчуп", "красного"));
        trainMethodsObjects.processBee(new Bee("male", 10));
        trainMethodsObjects.processObstacle(new Obstacle("здесь написано описание", "очень важное"));
        trainMethodsObjects.processPineapple(new Pineapple("fresh", 0.111));




    }
}
