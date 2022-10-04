import java.util.Scanner;

public class num4nomassiv {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int k = num.nextInt();
        for (int  i = 0;  i < n-1; ++i) {
            int l = k;
            k = num.nextInt();
            if (k < l) {
                System.out.println(l);
            }
        }
    }
}
