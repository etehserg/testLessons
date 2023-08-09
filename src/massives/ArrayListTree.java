package massives;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

class ArrayListThree {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        numbers.add(sc.nextInt());
        System.out.println("Введите второе число:");
        numbers.add(sc.nextInt());
        System.out.println("Введите третье число:");
        numbers.add(sc.nextInt());
        Collections.sort(numbers);
        numbers.forEach(System.out::println); //проверка
        var intSummaryStatistics = new IntSummaryStatistics();
        for (Integer number : numbers) {
            int valueOf = Integer.valueOf(number);
            intSummaryStatistics.accept(valueOf);
        }
        long sum = intSummaryStatistics.getSum();

        System.out.println("Сумма элементов равна " + sum);
        double average = intSummaryStatistics.getAverage();
        System.out.println("Среднее значение равно " + average);
        System.out.println("Медиана равна " + numbers.get(numbers.size()/2));
    }
}