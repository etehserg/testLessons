import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date1 {
    public static void main(String[] args) {
        Date date1 = new Date();
        SimpleDateFormat format1;
        format1 = new SimpleDateFormat("yyyy лет MM месяцев dd дней hh часов mm минут ss секунд");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в мс");
        long date1User = sc.nextLong();
        date1.setTime(date1User);
        System.out.println("Введенная дата: " + format1.format(date1));
        System.out.println("Количество мс: " + date1.getTime());
        System.out.println();

        Date date2 = new Date();
        System.out.println("Введите дату в мс");
        long date2User = sc.nextLong();
        date2.setTime(date2User);
        System.out.println("Введенная дата: " + format1.format(date2));
        System.out.println("Количество мс: " + date2.getTime());
        System.out.println();

        Date date3 = new Date();
        date3.setTime(date2User-date1User);
        System.out.println("Разница между датами: " + format1.format(date3));
        System.out.println("Количество мс: " + date3.getTime());
        System.out.println();

    }
}