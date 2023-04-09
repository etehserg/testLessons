import java.util.Arrays;

public class Massives4 {
    public static void main(String[] args){
        int[] myMassive = {1, 5, 9, 6, 2, 4};
       // Arrays.sort(myMassive);
        //System.out.println(Arrays.toString(myMassive));

        boolean isSorted = false;
        int tempInt = 0;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i<myMassive.length-1; i++){
                if (myMassive[i]>myMassive[i+1]){
                    tempInt = myMassive[i];
                    myMassive[i]=myMassive[i+1];
                    myMassive[i+1]=tempInt;
                    isSorted=false;
                    }
                }
            }
        System.out.println(Arrays.toString(myMassive));
    }
}