import java.util.Scanner;
class Strings1
{
    // Метод реверсирования строки в Java с использованием `StringBuilder`
    /*public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args){
        Scanner mySc = new Scanner(System.in);
        String str = mySc.nextLine();
        str = reverse(str);
        System.out.println(str);
    }*/

    //метод реверсирования строки через цикл
    public static void main(String[] args){
        Scanner mySc = new Scanner(System.in);
        String str = mySc.nextLine();
        int strLength = str.length()-1;
        do {
            System.out.print(str.charAt(strLength));
            strLength--;
        } while (strLength>=0);
        }
}