package massives;

public class Massives2 {
    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5 };
        int sumArr=0;
        for (int j : arr) {
            sumArr = sumArr + j;
        }
        System.out.println(sumArr);
    }
}