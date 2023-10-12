package homework.day2.basetask.ifTask;

import homework.day2.basetask.ifTask.TrainMethodsIf;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул " + trainMethodsIf.returnNewInt(16));
        System.out.println("метод returnNewLong вернул " + trainMethodsIf.returnNewLong(300));
        System.out.println("метод returnNewChar вернул " + trainMethodsIf.returnNewChar('b'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsIf.returnNewFloat((float) 0.555));
        System.out.println("метод returnNewDouble вернул " + trainMethodsIf.returnNewDouble(444.444444));
        trainMethodsIf.returnNewBoolean(false);
    }
}
