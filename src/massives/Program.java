package massives;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {

        Collection<String> states = new HashSet<>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        // пытаемся добавить элемент, который уже есть в коллекции
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);    // false

        System.out.printf("Set contains %d elements \n", states.size());    // 3

        for (String state : states) {

            System.out.println(state);
        }
        // удаление элемента
        states.remove("Germany");

        // хеш-таблица объектов Person
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Mike"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        for (Person p : people) {

            System.out.println(p.getName());
        }
    }
}

class Person {

    private String name;

    public Person(String value) {

        name = value;
    }

    String getName() {
        return name;
    }
}