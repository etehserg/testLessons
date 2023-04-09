public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 6;
        boolean c = myFunc(a, b, true);
    }

    public static boolean myFunc(int a, int b, boolean c) {
        for (int i = 0; i <= b; i++) {
            do {
                a++;
            }
            while (a == b);
        }

        return c;
    }
}

