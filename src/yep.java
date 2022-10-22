import java.util.Arrays;
import java.util.Scanner;

public class yep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int n = 0;
        if (l % 8 == 0) n = l / 8;
        else n = l / 8 + 1;
        byte[] arr = new byte[n];
        if (l - (n - 1) * 8 == 8) {
            for (int i = 0; i < n; ++i) {
                int count = 8;
                int m = 0;
                byte k = 0;
                while (count > 0 && 8 >= m) {
                    String b = in.next();
                    if (b.equals("true")) {
                        k += Math.pow(2, count - 1);
                    }
                    --count;
                    ++m;
                }
                arr[i] = k;
            }
        } else {
            for (int i = 0; i < n - 1; ++i) {
                int count = 8;
                int m = 0;
                byte k = 0;
                while (count > 0 && 8 >= m) {
                    String b = in.next();
                    if (b.equals("true")) {
                        k += Math.pow(2, count - 1);
                    }
                    --count;
                    ++m;
                }
                arr[i] = k;
            }
            int count = 0;
            byte k = 0;
            while (l - (n - 1) * 8 > count) {
                String b = in.next();
                if (b.equals("true")) {
                    k += Math.pow(2, l - (n - 1) * 8 - 1 - count);
                }
                ++count;
            }
            arr[n - 1] = k;
        }
        //System.out.println(Arrays.toString(arr));
        String s = "";
        if (l - (n - 1) * 8 == 8) {
            for (byte a : arr) {
                for (int i = 8; i > 0; --i) {
                    if (a % 2 == 0) s = "false " + s;
                    else s = "true " + s;
                    a /= 2;
                }
            }
        } else {
            String w = "";
            for (int j = 0; j < n - 1; ++j) {
                for (int i = 8; i > 0; --i) {
                    if (arr[j] % 2 == 0) w = "false " + w;
                    else w = "true " + w;
                    arr[j] /= 2;
                }
                s += w;
                w = "";
            }
            for (int i = l - (n - 1) * 8; i > 0; --i) {
                if (arr[n-1] % 2 == 0) w = "false " + w;
                else w = "true " + w;
                arr[n-1] /= 2;
            }
            s+=w;
        }
        System.out.println(s);

    }
}