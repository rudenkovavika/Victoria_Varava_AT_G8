package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class MamaTask {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        boolean a = list.stream().anyMatch("мама"::equals);
        System.out.println(a);

        boolean b = list.stream().allMatch(x -> x.contains("м"));
        System.out.println(b);

        List<String> add = list.stream().map(c -> c + "м").toList();
        System.out.println(add);


    }
}
