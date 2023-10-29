package homework.day5;

public class NumbersToArray {
    public void findNumbers(String text) {
        for (char a : text.toCharArray()) {
            if (Character.isDigit(a)) {
                System.out.println(a);
            }
        }
    }
}
