package in.somanath.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class GroupingExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 22),
            new Person("Bob", 35),
            new Person("Charlie", 22),
            new Person("Dave", 35)
        );
        
        Map<Integer, List<Person>> collect = people.stream().collect(Collectors.groupingBy(Person->Person.age));
        
        System.out.println(collect);
    }
    
}
