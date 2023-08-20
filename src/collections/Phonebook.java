package collections;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class People {
    private final String name;
    private final String phoneNumber;

    public People(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class Phonebook {
    public static void main(String[] args) {
        var peopleList = getPeople();
        var map = createPeopleMapList(peopleList);
        findPersonByPhone(map);
    }

    private static void findPersonByPhone(Map<String, String> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер через +");
        String phone = sc.nextLine();
        String person = map.get(phone);
        System.out.println(person);
    }

    @NotNull
    private static Map<String, String> createPeopleMapList(ArrayList<People> peopleList) {
        Map<String, String> map = new HashMap<>();
        for (People ob : peopleList) {
            map.put(ob.getPhoneNumber(), ob.getName());
        }
        return map;
    }

    @NotNull
    private static ArrayList<People> getPeople() {
        ArrayList<People> peopleList = new ArrayList<>();
        peopleList.add(new People("Сергей", "+79991234567"));
        peopleList.add(new People("Даниил", "+49123123123"));
        peopleList.add(new People("Денис", "+11231231231"));
        return peopleList;
    }
}
