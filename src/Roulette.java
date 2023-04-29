import java.util.Random;
import java.util.Scanner;

public class Roulette {
    public static int generate(int min, int max) {
        Random random = new Random();
        int randomInt = random.nextInt((max - min) + 1) + min;
        return randomInt;
    }

    public static boolean logic(int b, int c, int d) {
        boolean stavkaIsTrue = false;
        switch (b) {
            case 1:
                if (c == d) {
                    stavkaIsTrue = true;
                }
                break;
            case 2:
                if (d % 2 == 0) {
                    stavkaIsTrue = true;
                }
                break;
            case 3:
                if (d % 2 == 1) {
                    stavkaIsTrue = true;
                }
                break;
            case 4:
                if (d > 18) {
                    stavkaIsTrue = true;
                }
                break;
            case 5:
                if (d < 18) {
                    stavkaIsTrue = true;
                }
                break;
        }
        return stavkaIsTrue;
    }

    public static boolean inputOutput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш тип ставки: конкретное число (1), четное (2), нечетное (3), больше 18 (4), меньше 18(5)");
        int stavkaType = sc.nextInt();
        System.out.println("Введите вашу ставку: от 0 до 36");
        int stavka = sc.nextInt();
        int computerNumber = generate(0, 36);
        System.out.println("Число от компьютера: " + computerNumber);
        boolean logicTrue = Roulette.logic(stavkaType, stavka, computerNumber);
        System.out.println("Ставка " + logicTrue);
        return logicTrue;
    }

    public static void main(String[] args) {
        int score = 100;
        while (score > 0 && score < 1500) {
            boolean tempBool = Roulette.inputOutput();
            if (tempBool == true) {
                score += 1;
            } else score -= 1;
            System.out.println("Ваши очки: " + score);
        }
    }
}