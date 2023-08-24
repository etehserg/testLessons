package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NumbersGenerator {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int number = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите лимит: ");
        int limit = sc.nextInt();
        while (number <= limit) {
            int numberSquare = number * number;
            if (isSimple(number)) {
                map.put(number, numberSquare);
            }
            number++;
        }
        System.out.println();
        System.out.println(map);
    }

    private static boolean isSimple(int j) {
        boolean simple = false;

        for (int i = 2; i * i <= j; i++) {
            simple = (j % i == 0);
            if (simple) {
                break;
            }
        }
        if (!simple) {
            System.out.print(j + " ");
        }
        return !simple;
    }

}
