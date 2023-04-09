public class Massives5 {
    public static void main(String[] args) {
        int maxArray = 0;
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}} ;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if (maxArray < array[i][j]){
                    maxArray = array[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент двумерного массива " + maxArray);
    }
}