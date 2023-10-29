package homework.day5;

public class PrintToColumnStatic {
    public static void printColumn(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
