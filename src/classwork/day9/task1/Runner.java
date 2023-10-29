package classwork.day9.task1;

import classwork.day9.task1.MyClass;
import classwork.day9.task1.MyInterface;

public class Runner {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(new MyInterface() {
            @Override
            public double doSomething() {
                return 3.14;
            }
        });
    }
}
