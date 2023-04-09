public class Calendar {
    public static void main(String[] args) {
        Calendar.calendar2(5);
    }
    public static void calendar( int daysNumber) {
        if (daysNumber == 1) {
            System.out.println("Monday");
        } else if (daysNumber == 2) {
            System.out.println("Tuesday");
        } else if (daysNumber == 3) {
            System.out.println("Wednesday");
        } else if (daysNumber == 4) {
            System.out.println("Thursday");
        } else if (daysNumber == 5) {
            System.out.println("Friday");
        } else if (daysNumber == 6) {
            System.out.println("Saturday");
        } else if (daysNumber == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong number");
        }
    }

    public static void calendar2 (int daysNumber2){
        switch (daysNumber2) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}
