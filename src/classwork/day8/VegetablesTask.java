package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class VegetablesTask {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }

        System.out.println();

        int a = 0;

        for (String vegetable : vegetables) {
            if (vegetable.contains("а")) {
                a++;
            }
            System.out.println(a);
        }

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.print(vegetables.get(i) + " ");
        }

        System.out.println();

        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }
    }
}

