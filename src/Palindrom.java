import java.util.*;

public class Palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите строку");
        String str = sc.next();
        StringBuilder newBuffer = new StringBuilder(str);
        newBuffer.reverse();
        String strReversed = newBuffer.toString();
        System.out.println(str.equals(strReversed));
    }
}