import java.util.Scanner;

public class num3nomassiv {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int min = num.nextInt();
        for (int i = 0; i < n-1; ++i) {
            int x = num.nextInt();
            if (min > 0 && x < min && x > 0|| min <= 0 && x > min && x > 0) {
                min = x;
            }
        }
        System.out.println(min);
    }
}
