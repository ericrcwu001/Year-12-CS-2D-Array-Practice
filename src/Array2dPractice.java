public class Array2dPractice {

    // Declare all methods as static.

    // 1. sumAllCells
    public static int sumAllCells(int[][] arr) {
        int sum = 0;
        for (int[] temp : arr) {
            for (int x : temp) {
                sum += x;
            }
        }
        return sum;
    }

    // 2. sumRowN
    public static int sumRowN(int[][] arr, int row) {
        int sum = 0;
        for (int x : arr[row]) {
            sum += x;
        }
        return sum;
    }

    // 3. sumColN
    public static int sumColN(int[][] arr, int col) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i][col];
        }
        return sum;
    }

    // 4. sumAllCellsBetween
    public static int sumAllCellsBetween(int[][] arr, int x1, int y1, int x2, int y2) {
        int sum = 0;
        for (int i = x1; i <= x2; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (i == x1 && j >= y1) sum += arr[i][j];
                else if (i == x2 && j <= y2) sum += arr[i][j];
                else if (i > x1 && i < x2) sum += arr[i][j];
            }
        }
        return sum;
    }
}
