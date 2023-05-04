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

    public static int inputOutput(int score) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш тип ставки: конкретное число (1), четное (2), нечетное (3), больше 18 (4), меньше 18(5)");
        int betType = sc.nextInt();
        int bet;
        int betValue = 0;
        int score1 = (int) (score*0.1);
        if (betType==1) {
            System.out.println("Введите ваше число: от 0 до 36");  //нужно чтобы печаталось, если betType =1, иначе пропускаем
            bet = sc.nextInt();
            System.out.println("Введите вашу ставку: от 0 до " + score1);
            betValue = sc.nextInt()*35;
        }
        else bet = 1;
        int computerNumber = generate(0, 36);
        System.out.println("Число от компьютера: " + computerNumber);
        boolean logicTrue = Roulette.logic(betType, bet, computerNumber);
        System.out.println("Ставка " + logicTrue);
        int o;
        if (logicTrue &&betType==1){
            o = betValue;
        }
        else if (logicTrue) {
            o = 1;
        } else if (betType == 1) {
            o = betValue/35*(-1);
        }
        else o=bet*(-1);
        return o;
    }

    public static void main(String[] args) {
        int score = 100;
        while (score > 0 && score < 1500) {
            int in = Roulette.inputOutput(score);
            score = in+score;
            System.out.println("Ваши очки: " + score);
            if (score <0) {
                System.out.println("Вы проиграли");
            }
            if (score > 1500){
                System.out.println("Победитель");
            }
        }
    }
}