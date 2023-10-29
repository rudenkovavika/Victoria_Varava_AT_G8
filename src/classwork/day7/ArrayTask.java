package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class ArrayTask {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        String[] text = "мама мыла раму мыла".split(" ");

        for (String word : text) {
            myList.add(word);
            System.out.println();
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        for (String s : myList) {
            System.out.println(s);
        }
    }
}
