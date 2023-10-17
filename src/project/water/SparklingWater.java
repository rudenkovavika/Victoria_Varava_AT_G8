package project.water;

public class SparklingWater extends Water {
    private boolean isOpened;

    private Bubble[] bubbles;

    public SparklingWater() {
        isOpened(); //правильно вызвала?
    }

    public static void pump(Bubble[] bubbles) {

        //который сетает массив из пузырьков в воду
    }

    public static void setOpened() {

        //который меняет состояние воды на "открытое" и запускает метод degas ()
    }

    private degas() {
        int temperature = getTemperature();



        //который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
          //      (для засыпания на секунду используем Thread.sleep(1000);)
    }

    private void isOpened() {

    }
}
