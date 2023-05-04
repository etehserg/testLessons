import java.util.*;
public class GamesCatalogue {
    public static String getString(String[] str) { //args transit to method defaultString
        String test = Arrays.toString(str);
        String test1 = test.replace("null, ", "");
        String test2 = test1.replace("null", "");
        return test2;
    }

    public static void addName(String[] library, String newGameName) {
        for (int i = 0; i < library.length - 1; i++) {
            if (library[i] == null) {
                library[i] = newGameName;
                break;
            }

        }
    }

    public static void delName(String[] library, String delGameName) {
        for (int i = 0; i < library.length - 1; i++) {
            if (Objects.equals(library[i], delGameName)) {
                library[i] = null;
                break;
            }
        }
    }

    public static void main(String[] args) {
        String[] library = new String[100];
        library[0] = "Path of Exile";
        library[1] = "Dragon Age";
        library[2] = "CS GO";
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите действие: 1. Добавить запись, 2 Удалить запись, 3 Вывести список записей, 4 Выйти");
        int choose = sc.nextInt();
            if (choose == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите наименование игры:");
                String newGameName = scanner.nextLine();
                addName(library, newGameName);
            }
            if (choose == 2) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите наименование игры:");
                String delGameName = scanner.nextLine();
                delName(library, delGameName);
                System.out.println(getString(library));
            }
            if (choose == 3) {
                System.out.println("текущие игры:");
                System.out.println(getString(library));
            }
    }
}

