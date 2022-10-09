import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationTable {
    public static int[][] Multiplication(int n, int m) {
        int row = 0, column = 0;
        int[][] table = new int[n][m];
        for (int k = 0; k < n * m; ++k, ++column) {
            if (k != 0 && k % m == 0) {
                ++row;
                column = 0;
            }
            table[row][column] = row * column;
        }
        return table;

    }
}

