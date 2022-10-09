import java.util.Arrays;
import java.util.Scanner;

public class Spiral {
    public static int[][] spiral(int n) {
        int count = (2*n+1)*(2*n+1)-1;
        int[][] sp = new int[2*n+1][2*n+1];
        for (int i = 0; i < 2*n+1; ++i) {
            sp[i][2*n] = count;
            --count;
        }
        for (int i = 2*n-1; i > 0; --i) {
            sp[2*n][i] = count;
            --count;
        }
        for (int i = 2*n; i >= 0; --i) {
            sp[i][0] = count;
            --count;
        }
        for (int i = 1; i < 2*n; ++i) {
            sp[0][i] = count;
            --count;
        }
        while (count>1) {
            for (int i = 1; i < 2*n; ++i) {
                sp[i][2*n-1] = count;
                --count;
            }
            for (int i = n; i>0; --i) {
                sp[2*n-1][i] = count;
                --count;
            }
            for (int i = n; i>0; --i) {
                sp[i][1] = count;
                --count;
            }
            sp[1][n] = 1;
            sp[n][n] = 0;
        }
        return sp;

    }

}                                           //на бОльшую спиральку меня не хватит заполнить её