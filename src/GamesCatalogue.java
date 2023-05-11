import java.io.*;
import java.util.*;

class Games {
    public String name;
    public String genre;
    public String year;

    public Games(String name, String genre, String year) {
        this.name = name;
        this.genre = genre;
        this.year = year;
    }

    public String toString() {
        return name + "/" + genre + "/" + year;
    }

    public static Games fromString(String line) {
        String[] test134 = line.split("/");
        Games Games1 = new Games(test134[0], test134[1], test134[2]);
        return Games1;
    }
}

public class GamesCatalogue {
    public static void getString(Games[] library) { //args transit to method defaultString
        for (int i = 0; i < library.length - 1; i++) {
            if (library[i] != null) {
                String test1 = library[i].toString();
                System.out.println(test1);
            }
        }
    }

    public static void addName(Games[] library, String newGameName, String genre, String year) {
        for (int i = 0; i < library.length - 1; i++) {
            if (library[i] == null) {
                library[i] = new Games(newGameName, genre, year);
                break;
            }
        }
    }

    public static void delName(Games[] library, String delGameName) {
        for (int i = 0; i < library.length - 1; i++) {
            if (Objects.equals(library[i].name, delGameName)) {
                library[i] = null;
                break;
            }
        }
    }

    public static void writeFile(Games[] library) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("library.txt")));
        for (int i = 0; i < library.length - 1; i++) {
            if (library[i] != null) {
                String test1 = library[i].toString();

                writer.write(test1);
                writer.newLine();
            }
        }
        writer.close();
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("library.txt");
        String[] library = new String[100];
        Scanner sc = new Scanner(file);
        for (int i1 = 0; sc.hasNextLine(); i1++){
            library[i1]=sc.nextLine();
        }
        System.out.println("File data:" + Arrays.toString(library));
        }

    public static void main(String[] args) throws IOException {
        Games[] library;
        library = new Games[100];
        library[0] = new Games("Path of Exile", "ARPG", "2008");
        library[1] = new Games("Lineage II", "MMORPG", "2003");
        library[2] = new Games("CS GO", "ACTION", "1996");
        int choose;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите действие: 1. Добавить запись, 2 Удалить запись, 3 Вывести список записей, 4 Exit, 5 Save to File, 6 Load from file");
            choose = sc.nextInt();
            if (choose == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите наименование игры:");
                String newGameName = scanner.nextLine();
                System.out.println("Введите жанр игры:");
                String newGenre = scanner.nextLine();
                System.out.println("Введите год выпуска игры:");
                String newGameYear = scanner.nextLine();
                addName(library, newGameName, newGenre, newGameYear);
                getString(library);
            }
            if (choose == 2) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите наименование игры:");
                String delGameName = scanner.nextLine();
                delName(library, delGameName);
                getString(library);
            }
            if (choose == 3) {
                System.out.println("текущие игры:");
                getString(library);
            }
            if (choose == 5) {
                System.out.println("Записываем:");
                writeFile(library);
            }
            if (choose == 6) {
                System.out.println("Считываем:");
                readFile();
            }
        }
        while (choose != 4);
    }
}

