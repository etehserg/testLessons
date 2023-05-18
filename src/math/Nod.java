package math;

public class Nod{
    public static void main(String[] args) {
        System.out.println(nod(17, 42));
    }
    public static int nod (int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }
}