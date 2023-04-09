public class Massives6 {
    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] multiply = new int [a.length][b[0].length];
        for (int i=0; i<multiply[0].length; i++)
            for (int j=0; j<multiply.length; j++)
                for (int k=0; k<a[0].length; k++) //лишнее убрать
                    multiply[i][j] = multiply[i][j] + a[i][k] * b[k][j];
        return multiply;
    }
    public static void main (String[] args) {
        int[][] a = new int[][] {
                {1,2,3},
                {4,5,6}
        };
        int[][] b = new int[][] {
                {7,8,9},
                {10,11,12}
        };
        int[][] test = Massives6.multiply(a, b);
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                System.out.print(" " + test[i][j] + " ");
            }
            System.out.println();
        }
    }
}