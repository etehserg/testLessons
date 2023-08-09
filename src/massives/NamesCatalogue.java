package massives;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*Написать программу справочник имён. Программа считывает из файла базу данных имен в текстовом виде:
        Olivia,F,16573
        Emma,F,14435
        Charlotte,F,12891
        Amelia,F,12333
        ….
        пользователь вводит нужное имя, программа ищет бинарным поиском это имя в базе данных и если находит, выводит пол и частоту (2я и 3я колонки).
        —
        Нужно определить класс - структуру с тремя полями (имя, пол, частота)+
        БД надо считать в массив классов в начале программы (не искать в самом файле).
        Чтобы пользоваться сортировкой и бинарным поиском, понадобиться сравниватель объектов (для чисел и строк есть уже готовые, но когда мы создаём свой класс, нужно определить как сравнивать инстансы между собой). Почитать про Comparator.
        С помощью компаратора можно будет пользоваться Arrays.sort(...) и Arrays.binarySearch(...)
        1. Class with 3 poles +
        2. Сканер из файла +
        3. Парсер +
        4. Сложить в массив +
        5. Подготовить массив к поиску (отсортировать)+
        6. Считать данные пользователя +
        7. Выполнить логарифмический(бинарный) поиск
        8. Вывести только пол и частоту если есть введенные данные*/
class Names {
    public String name;
    public String pole;
    public String frequency;

    public Names(String name, String pole, String frequency) {
        this.name = name;
        this.pole = pole;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Names{" +
                " pole='" + pole + '\'' +
                ", frequency='" + frequency + '\'' +
                '}';
    }
}

public class NamesCatalogue {
    public static String[] readFile() throws FileNotFoundException {
        File file = new File("yob2022.txt");
        String[] names = new String[10000];
        Scanner sc = new Scanner(file);
        for (int i1 = 0; sc.hasNextLine() && i1 < 10000; i1++) {
            names[i1] = sc.nextLine();
        }
        return names;
    }

     static Names fromString(String names) {
        String[] test134 = names.split(",");
        return new Names(test134[0], test134[1], test134[2]);
    }

    public static Names[] isSorted(Names[] namesSorted) {
        Arrays.sort(namesSorted, Comparator.comparing(o -> o.name));
        return namesSorted;
    }

    public static Names[] massiveStringToMassiveName(String[] lines) {
        Names[] namesMassiveObject = new Names[10000];
        for (int i = 0; i < lines.length; i++) {
//            System.out.println(lines[i]);
            if (lines[i] != null) {
                namesMassiveObject[i] = fromString(lines[i]);
            }

        }
        return namesMassiveObject;
    }

    public static int bynSearch(Names[] inNames, String inName) {
        int names;
        Names key = new Names(inName, null, null);
        names = Arrays.binarySearch(inNames, key, Comparator.comparing(o -> o.name));
        return names;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        String fromUser = sc.nextLine();
        String[] read = readFile();        //call readFile   input file, output massive Strings
        Names[] newMas = massiveStringToMassiveName(read);
        Names[] sortMas = isSorted(newMas);   //call isSorted
        int searchMas = bynSearch(sortMas, fromUser);
        System.out.println(searchMas);
        if (searchMas > 0) {
            System.out.println("is match!");
            System.out.println(sortMas[searchMas]);
        }

        //print pole and frequency
    }


}