package classwork.day9.task2;

import classwork.day9.task2.ClassX;
import classwork.day9.task2.MyObClass;

public class RunnerOb {
    public static void main(String[] args) {
        MyObClass mc = new MyObClass();
        mc.justMethod(ClassX::new);
    }
}
