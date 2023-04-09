package calculators.two;

interface CalculatorTest {
    double add(double a, double b);
    double minus(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}

class Calculator2Test implements CalculatorTest {
    public double add(double a, double b){
        return a+b;
    }

    public double minus(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b) {
        try {
            return (a / b);
        }
       catch (ArithmeticException e){
            return b;
        }
    }
}

public class Calculator2 {
    public static void main(String[] args){
        var testCalc = new Calculator2Test();
        var c = testCalc.divide(3, 0);

        System.out.println(c);
    }
}