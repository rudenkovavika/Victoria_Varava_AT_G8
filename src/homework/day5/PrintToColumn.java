package homework.day5;

public class PrintToColumn {
    public void printColumn(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}