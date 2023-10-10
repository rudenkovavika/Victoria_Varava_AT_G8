package pretask;

public class ConditionalLoopExample {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            if (a % 2 != 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}
