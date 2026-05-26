package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Z29_RECORDS_EXAMPLE {
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 22));
        people.add(new Person("Bob", 17));
        people.add(new Person("Charlie", 30));

        List<Person> adults = people.stream()
                .filter(person -> person.age() >= 18)
                .collect(Collectors.toList());

        System.out.println("People: " + people);
        System.out.println("Adults: " + adults);
    }
}
