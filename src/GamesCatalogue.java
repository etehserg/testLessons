import java.util.*;
public class GamesCatalogue{
    public static String getString (String[] str){ //args transit to method defaultString
        String test = Arrays.toString(str);
        String test1 = test.replace("null, ", "");
        String test2 = test1.replace("null", "");
        return test2;
    }
    public static String[] addName(String[] str, String newGameName){
        String[] newName = str;
        for (int i=0;i< str.length-1; i++) {
            if (str[i] == null) {
                str[i] = newGameName;
                break;
            }

        }
        return newName;
    }

    public static void main (String[] args){
        String[] library = new String[100];
        library[0] = "Path of Exile";
        library[1] = "Dragon Age";
        library[2] = "CS GO";
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите действие: 1. Добавить запись, 2 Удалить запись, 3 Вывести список записей");
        int choise = sc.nextInt();
        if (choise==1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите наименование игры:");
            String newGameName = scanner.nextLine();
            addName(library, newGameName);
            System.out.println(getString(library));
        }
    }

}
   /* public GamesCatalogue[] games = new GamesCatalogue[100];

    public String name;
    public String genre;
    public String year;

    public static void []gameDelete (String delGameName){ //delete existing game
    return new GamesCatalogue[100];


    public static void main (String[] args){

        if (choise==2){
            System.out.println("Введите наименование игры:");
            String delGameName = sc.nextLine();
            gameDelete(delGameName);
        }
        if (choise==3){
            System.out.println("текущие игры:");
            System.out.println(Arrays.toString(getGames()));
        }
    }*/
