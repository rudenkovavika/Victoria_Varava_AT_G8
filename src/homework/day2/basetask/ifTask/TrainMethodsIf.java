package homework.day2.basetask.ifTask;

public class TrainMethodsIf {
    public static int returnNewInt(int a) {
        if (a < 8) {
            return a * 7;
        } else {
            return a / 4;
        }
    }

    public static long returnNewLong(long a) {
        if (a > 300) {
            return a - 300;
        } else {
            return a + 20;
        }
    }

    public static String returnNewChar(char a) { //всегда ли можно для сhar писать String?
        if (a == 'g') {
            return "go";
        } else {
            return "o" + a;
        }
    }

    public static float returnNewFloat(float a) {
        if (a == 0.67) {
            return a;
        } else {
            return a * 2;
        }
    }

    public static double returnNewDouble(double a) {
        if (a > 30 & a < 80) {
            return a + 87;
        } else if (a > 80 & a < 400) {
            return a - 87;
        } else if (a > 400) {
            return a / 4;
        } else return a;
    }

    public static void returnNewBoolean(boolean a) {
        if (a == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}
