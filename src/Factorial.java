public class Factorial{
    public static void main(String[] args) {
    System.out.println(factorial(16));
    }
    public static int factorial(int a) {
     int b = 1;
     for (int i = 1; i <= a; i++) {
         b = i*b;
     }
     return b;

 }
 int a = 5;
double b = 6.6;
int c = (int) (a/b);
double d = a/b;
}