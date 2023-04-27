import java.util.Random;
import java.util.Scanner;

public class PasswordTest {
    public static String generate (int leftLimit, int rightLimit, int targetStringLength) {
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i<targetStringLength; i++){
            int randomLimitedInt = leftLimit + (int)(random.nextFloat()*(rightLimit-leftLimit+1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип пароля: letter, symbol, number");
        String testTypePass = sc.nextLine();
        System.out.println("Введите длину пароля: ");
        int c = sc.nextInt();
        int a = 0, b = 0;
        switch (testTypePass) {
            case "letter" -> {
                a = 97;
                b = 122;
            }
            case "symbol" -> {
                a = 32;
                b = 42;
            }
            case "number" -> {
                a = 48;
                b = 57;
            }
        }
        String str = PasswordTest.generate(a, b, c);
        System.out.println(str);
    }
}