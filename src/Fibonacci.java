public class Fibonacci {
    public static void main (String[] args) {
        int first = 1, second = 1; //начальное значение 1ч 2х членов
        int next;
        int a = 20; //до какого значения выводить
        System.out.print(first + " " + second + " ");

    for (int i = 3; i<=a; i++ ){ //запускаем цикл от 3х до d
        next = first+second;
        System.out.print(next + " ");
        first = second;
        second = next;
    }

    System.out.println();
}
}