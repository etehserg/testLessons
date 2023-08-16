package collections;

import java.util.*;

class Person {
    private final String name;
    private final String city;

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
        people.add(new Person("Ольга", "Санкт-Петербург"));
        people.add(new Person("Иван", "Москва"));
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

        System.out.println(map); //task part 1

        List<String> cities = new ArrayList<>(map.keySet()); //new list for comparing
        cities.sort(Comparator.comparingInt(city -> map.get(city).size()));  //hand made comparatator to size keys values transiting element from string to int
        System.out.println(cities); //task part 2 print
    }
}

