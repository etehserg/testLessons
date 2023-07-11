package massives;

import java.util.ArrayList;
import java.util.Collections;
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
        long sum = numbers.stream().mapToInt(Integer::valueOf).summaryStatistics().getSum();
        System.out.println("Сумма элементов равна " + sum);
        double average = numbers.stream().mapToInt(Integer::valueOf).summaryStatistics().getAverage();
        System.out.println("Среднее значение равно " + average);
        System.out.println("Медиана равна " + numbers.get(1));
    }
}