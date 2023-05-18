package massives;

public class Massives5 {
    public static void main(String[] args) {
        int maxArray = 0;
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}} ;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (maxArray < anInt) {
                    maxArray = anInt;
                }
            }
        }
        System.out.println("Максимальный элемент двумерного массива " + maxArray);
    }
}