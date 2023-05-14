import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Date1 {
    public static void main(String[] args) {
        Calendar today = new GregorianCalendar();
        Calendar user1 = new GregorianCalendar(2024, 05, 14);
        today.add(Calendar.DAY_OF_YEAR, 2); //+2 days
        System.out.println("Сегодня + 2 дня = " + today.getTime());   // today +2
    }
}
