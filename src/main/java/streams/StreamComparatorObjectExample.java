package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class StreamComparatorObjectExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparingInt(person -> person.age))
                .collect(Collectors.toList());

        System.out.println("Sorted by Age: " + sortedByAge);

        List<Person> sortedByAgeDesc = people.stream()
                .sorted(Comparator.comparingInt((Person person) -> person.age).reversed())
                .collect(Collectors.toList());

        System.out.println("Sorted by Age Descending: " + sortedByAgeDesc);

        List<Person> sortedByAgeThenName = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge)
                        .thenComparing(Person::getName))
                .collect(Collectors.toList());

        System.out.println("Sorted by Age then Name: " + sortedByAgeThenName);
    }
}