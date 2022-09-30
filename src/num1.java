import java.util.Scanner;
public class num1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int a = 1, b = 1;
        if (n == 1 || n == 2) {
            System.out.println(1);
        }
        else {
            for (int i = 0; i < n-2; ++i) {
                if (a<b) {
                    a=a+b;
                }
                else {
                    b=b+a;
                }
            }
            System.out.println(Math.max(a, b));
        }
    }
}