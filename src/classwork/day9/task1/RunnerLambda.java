package classwork.day9.task1;

import classwork.day9.task1.MyClass;

public class RunnerLambda {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(() -> 3.14);
    }
}
