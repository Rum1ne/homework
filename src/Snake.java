public class Snake {
    public static int[][] snake(int n, int m) {
        int[][] sn = new int[n][m];
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (i % 2 == 0) {
                for (int k = 0; k < m; ++k) {
                    sn[i][k] = count;
                    ++count;
                }
            } else {
                for (int j = m - 1; j >= 0; --j) {
                    sn[i][j] = count;
                    ++count;
                }
            }
        }
        return sn;
    }
}
