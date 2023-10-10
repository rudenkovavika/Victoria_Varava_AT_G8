import java.util.Random;

public class Main {

    public static void main(String[] args) {
        new Main().foo();
    }
    public void foo() {

        int[] array = new int[10];
        int x = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            x = x + array[i];
        }

        System.out.println("Average value is: " + x / 10);
    }
}