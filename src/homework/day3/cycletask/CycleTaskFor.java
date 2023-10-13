package homework.day3.cycletask;

public class CycleTaskFor {
    public void printOddNumbers() {
        for (int i = 3; i <= 19; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
