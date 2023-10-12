package homework.day2.basetask.returnTask;

import homework.day2.basetask.returnTask.TrainMethodsReturn;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(2));
        System.out.println("метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(1000004));
        System.out.println("метод returnNewChar вернул " + trainMethodsReturn.returnNewChar((char) 44));
        System.out.println("метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat((float) 44.444));
        System.out.println("метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(30.888888));
        System.out.println("метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short) 5));
        System.out.println("метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte) 55));
        System.out.println("метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(true));

    }
}
