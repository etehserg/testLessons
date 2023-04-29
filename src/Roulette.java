import java.util.Random;
import java.util.Scanner;

public class Roulette {
    public static int generate(int min, int max) {
        Random random = new Random();
        int randomInt = random.nextInt((max - min) + 1) + min;
        return randomInt;
    }
    public static boolean logic(int b, int c, int d) {
        boolean betIsTrue = false;
        switch (b) {
            case 1 -> {
                if (c == d) {
                    betIsTrue = true;
                }
            }
            case 2 -> {
                if (d % 2 == 0) {
                    betIsTrue = true;
                }
            }
            case 3 -> {
                if (d % 2 == 1) {
                    betIsTrue = true;
                }
            }
            case 4 -> {
                if (d > 18) {
                    betIsTrue = true;
                }
            }
            case 5 -> {
                if (d < 18) {
                    betIsTrue = true;
                }
            }
        }
        return betIsTrue;
    }

    public static boolean inputOutput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш тип ставки: конкретное число (1), четное (2), нечетное (3), больше 18 (4), меньше 18(5)");
        int betType = sc.nextInt();
        System.out.println("Введите вашу ставку: от 0 до 36");  //нужно чтобы печаталось, если betType =1, иначе пропускаем
        int bet = sc.nextInt();
        int computerNumber = generate(0, 36);
        System.out.println("Число от компьютера: " + computerNumber);
        boolean logicTrue = Roulette.logic(betType, bet, computerNumber);
        System.out.println("Ставка " + logicTrue);
        return logicTrue;
    }

    public static void main(String[] args) {
        int score = 100;
        int betGamer = 1;   // for 2 part of new task (number from scanner) betGamer не больше 10% от score
        while (score > 0 && score < 1500) {
            boolean tempBool = Roulette.inputOutput();
            if (tempBool) {
                score += betGamer;
            } else score -= betGamer;
            System.out.println("Ваши очки: " + score);
        }
    }
}