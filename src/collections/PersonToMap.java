package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Person {
    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return name + " live in " + city;
    }

    //getters and setters
    public String getCity() {
        return city;
    }

}

public class PersonToMap {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        //add new
        people.add(new Person("Оксана", "Санкт-Петербург"));
        people.add(new Person("Сергей", "Санкт-Петербург"));
        people.add(new Person("Юлия", "Берлин"));
        people.add(new Person("Даниил", "Берлин"));
        //convert to map
        Map<String, ArrayList<Person>> map = new HashMap<>();
        for (Person ob : people) {
            if (map.containsKey(ob.getCity())) {
                map.get(ob.getCity()).add(ob);    //there are doing this: 1. if maps contains key - we contain to existing list data, else if not contains key, we are creating new list
            } else {
                var value = new ArrayList<Person>();
                value.add(ob);  //we are creating new element
                map.put(ob.getCity(), value);
            }
        }

        System.out.println(map);
    }
}

