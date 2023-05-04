package calculators;

class Calculator1 {
    private int memory; //поле, т.к. внутри класса, но не метода
    public int last;

    int add(int a, int b) {  //int add это метод; int a и int b параметры
        int result = a+b; //переменная, т.к. внутри метода
        this.last = result;
        return result;
    }
    int minus(int a, int b){
        this.last = a-b;
        return a-b;
    }
     void set(){
        this.memory=last;
    }
   int get(){
        return memory;
   }
}
class StaticCalculator {
    static int add(int a, int b) {
        return a+b;
    }
}

public class CalculatorTask {
    public static void main(String[] args) {
        Calculator1 clc = new Calculator1();  //конструктор нового экземпляра класса
        int calc1 = clc.add(4, 5); //вызываем метод инстанса по наименованию экземпляра класса
        System.out.println("вывод калькулятора 1: " + calc1);

        int calc2 = StaticCalculator.add(4, 5); //метод класса
        System.out.println("вывод калькулятора 2: " + calc2);

        Calculator1 calc = new Calculator1();
        calc.add(4,5);
        calc.set (); //запомнили 9ку
        calc.minus(5, 2); // 5 - 2 = 3
        System.out.println(calc.last);
        System.out.println("вывод метода минус: " + calc.minus(5, 2));
        int d = 10 + calc.get(); // 19
        System.out.println("10 + значение из памяти: " + d);

        var calcA = new Calculator1();

        var calcB = new Calculator1();

        calcA.add(10, 20);
        calcB.add(20, 30);

        System.out.println(calcA.last);
        System.out.println(calcB.last);
    }
}

/*идея в том, что мы задаем значение переменной в другом классе с помощью метода
дальше нужно как то ту переменную записать в переменную 1го класса*/