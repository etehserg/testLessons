package massives;

public class Massives6 {
    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(a, b, row, col);
            }
        }

        return result;
    }

    static int multiplyMatricesCell(int[][] a, int[][] b, int row, int col) {
        int cell = 0;
        for (int i = 0; i < b.length; i++) {
            cell += a[row][i] * b[i][col];
        }
        return cell;
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
        int[][] test = Massives6.multiplyMatrices(a, b);
        for (int[] ints : test) {
            for (int j = 0; j < test[0].length; j++) {
                System.out.print(" " + ints[j] + " ");
            }
            System.out.println();
        }
    }
}