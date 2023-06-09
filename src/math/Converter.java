package math;

import java.util.Scanner;

public interface Converter {
    double getConvertValueToCelsius(double baseValue);
    double getConvertValueToKelvin(double baseValue);
    double getConvertValueToFahrenheit(double baseValue);
}
class CelsiusConverter implements Converter{
    public double getConvertValueToCelsius(double baseValue) {
        return baseValue;
    }
    public double getConvertValueToKelvin(double baseValue) {
        return baseValue + 273.15;
    }
    public double getConvertValueToFahrenheit(double baseValue) {
        return baseValue*9/5+32;
    }
}


class KelvinConverter implements Converter{
    public double getConvertValueToKelvin(double baseValue) {
        return baseValue;
    }
    public double getConvertValueToCelsius(double baseValue){
        return baseValue - 273.15;
    }
    public double getConvertValueToFahrenheit(double baseValue){
        return (baseValue-273.15)*9/5+32;
    }
}


class FarengeitConverter implements Converter{
    public double getConvertValueToFahrenheit(double baseValue) {
        return baseValue;
    }
    public double getConvertValueToCelsius(double baseValue){
        return (baseValue-32)*5/9;
    }
    public double getConvertValueToKelvin(double baseValue){
        return (baseValue-32)*5/9+273.15;
    }
}

abstract class easterEgg implements Converter{
    public double getConvertValueToCelsius(double baseValue) {
        return baseValue;
    }
    public double getConvertValueEgg(double baseValue) {
        return 100501;
    }
}


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру:");
        double temperature = sc.nextDouble();
        System.out.println("Введите тип вводимой температуры в виде C, K, F");
        String tempIn = sc.next();
        System.out.println("Введите тип выводимой температуры в виде C, K, F");
        String tempOut = sc.next();
        String tempForCase = tempIn+tempOut;
        switch (tempForCase) {
            //преобразование из цельсия
            case "CC" ->
                    System.out.println("t в Цельсиях = " + new CelsiusConverter().getConvertValueToCelsius(temperature));
            case "CK" ->
                    System.out.println("t в Кельвинах = " + new CelsiusConverter().getConvertValueToKelvin(temperature));
            case "CF" ->
                    System.out.println("t в Фаренгейтах = " + new CelsiusConverter().getConvertValueToFahrenheit(temperature));

            //преобразование из кельвина
            case "KC" ->
                    System.out.println("t в Цельсиях = " + new KelvinConverter().getConvertValueToCelsius(temperature));
            case "KK" ->
                    System.out.println("t в Кельвинах = " + new KelvinConverter().getConvertValueToKelvin(temperature));
            case "KF" ->
                    System.out.println("t в Фаренгейтах = " + new KelvinConverter().getConvertValueToFahrenheit(temperature));

            //преобразование из фаренгейта
            case "FC" ->
                    System.out.println("t в Цельсиях = " + new FarengeitConverter().getConvertValueToCelsius(temperature));
            case "FK" ->
                    System.out.println("t в Кельвинах = " + new FarengeitConverter().getConvertValueToKelvin(temperature));
            case "FF" ->
                    System.out.println("t в Фаренгейтах = " + new FarengeitConverter().getConvertValueToFahrenheit(temperature));

            // пасхалка)
            case "CP" -> System.out.println("алых роз для Оксаны = " + new easterEgg() {
                @Override
                public double getConvertValueToKelvin(double baseValue) {
                    return 0;
                }

                @Override
                public double getConvertValueToFahrenheit(double baseValue) {
                    return 0;
                }
            }.getConvertValueEgg(temperature));
            default -> System.out.println("Неправильный тип температуры");
        }
    }
}
