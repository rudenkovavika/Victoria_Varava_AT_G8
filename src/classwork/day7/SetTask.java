package classwork.day7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTask {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        String[] text = "мама мыла раму мыла".split(" ");

        for (String word : text) {
            mySet.add(word);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s : mySet) {
            System.out.println(s);
        }
    }
}
