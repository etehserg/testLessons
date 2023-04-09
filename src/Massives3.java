public class Massives3 {
    public static void main (String[] args){
        int[] myMassive = {1, 5, 9, 6, 2, 4};
        int masLength = myMassive.length;
        int max = myMassive[0];
        for (int i = 1; i<masLength; i++) {
            max = Math.max(max, myMassive[i]);
        }
    System.out.println(max);
    }
}