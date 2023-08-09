package inout;

import java.util.stream.IntStream;

public class Nprint{
    public static void main(String[] args) {
    Nprint2.intN2(5);
    }
}
    class Nprint0 {
        public static void intN(int n) {
            IntStream.range(0, n).map(i -> n).forEach(System.out::println);
        }
    }

    class Nprint1 {
        public static void intN1(int n1) {
            int i = 0;
            if (i < n1) {
                do {
                    System.out.println(n1);
                    i += 1;
                } while (i < n1);
            }
        }
    }

    class Nprint2 {
        public static void intN2(int n2) {
            int i = 0;
            do {
                System.out.println(n2);
                i += 1;
            }
            while (i < n2);
        }
    }
