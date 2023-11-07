package homework.day5;

public class NumbersToArrayStatic {
    public static void findNumbers(String text) {
        for (char a : text.toCharArray()) {
            if (Character.isDigit(a)) {
                System.out.println(a);
            }
        }
    }
}
