package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class PersonCollection {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        long x = people.stream()
                .filter(a -> a.age >= 18)
                .filter(b -> (b.age <= 60 && b.sex == Person.Sex.MAN) || b.age <= 55)
                .count();

        System.out.println(x);
    }
}
