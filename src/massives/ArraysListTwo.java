package massives;

import java.util.Arrays;
import java.util.List;

class ArraysListTwo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        for (Integer number : numbers){
            System.out.println(number);
       }
        numbers.forEach(System.out::println);
    }
}
