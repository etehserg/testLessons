package massives;

import java.util.ArrayList;

class ArrayListOne {
    private final String name;

    public ArrayListOne(String name) {
        this.name = name;
    }

    public String toString() {
        return "People {" + "name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        ArrayList<ArrayListOne> people = new ArrayList<>();
        people.add(new ArrayListOne("Danya"));
        people.add(new ArrayListOne("Sergey"));
        people.add(new ArrayListOne("Oksana"));
        ArrayListOne yulya = new ArrayListOne("Yulya");
        people.add(yulya);
        System.out.println(people);
    }

}