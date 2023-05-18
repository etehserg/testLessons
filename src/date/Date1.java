package date;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Date1 {
    public static void main(String[] args) throws ParseException {
        Calendar today = new GregorianCalendar();
        Calendar user1 = new GregorianCalendar(2024, 05, 14);
        today.add(Calendar.DAY_OF_YEAR, 2); //+2 days
        System.out.println("Сегодня + 2 дня = " + today.getTime());   // today +2

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите новую строку в формате: yyyy, MM, dd");
        String newCalendar = sc.nextLine();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy, MM, dd");
        var user2 = format1.parse(newCalendar);
        System.out.println(user2);
    }
}