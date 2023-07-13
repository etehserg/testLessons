package massives;

import java.util.function.Function;

public class Transformer1 {
    // принимаем на вход данные - строку
    static int stringToInt(String name) {
        // печатаем
        System.out.println(name);

        // на выходе число
        return name.length();
    }

    // принимаем на вход строку и функцию (!)
    static int transform(String input, Function<String, Integer> transformer) {
        // вызываем функцию из второго параметра и передаём ей на вход строку из 1го параметра
        return transformer.apply(input);
    }

    public static void main(String[] args) {
        // вызываем функцию напрямую, передаём ей строку на вход
        var stringLength = stringToInt("Серёга");
        System.out.println(stringLength); // 6

        // вызываем функцию и передаём ей другую функцию!! (ну и строку)
        var stringLength2 = transform("Данил", Transformer1::stringToInt);
        System.out.println(stringLength2); // 5
    }
}