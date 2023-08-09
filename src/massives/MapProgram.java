package massives;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapProgram {

    public static void main(String[] args) {

        Map<Integer, String> states = new HashMap<>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        // получим объект по ключу 2
        String first = states.get(2);
        System.out.println(first);
        // получим весь набор ключей
        Set<Integer> keys = states.keySet();
        System.out.println(keys);
        // получить набор всех значений
        Collection<String> values = states.values();
        System.out.println(values);
        //заменить элемент
        states.replace(1, "Poland");
        // удаление элемента по ключу 2
        states.remove(2);
        // перебор элементов
        for (Map.Entry<Integer, String> item : states.entrySet()) {

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, MapPerson> people = new HashMap<String, MapPerson>();
        people.put("1240i54", new MapPerson("Tom"));
        people.put("1564i55", new MapPerson("Bill"));
        people.put("4540i56", new MapPerson("Nick"));

        for (Map.Entry<String, MapPerson> item : people.entrySet()) {

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}

class MapPerson {

    private String name;

    public MapPerson(String value) {

        name = value;
    }

    String getName() {
        return name;
    }
}