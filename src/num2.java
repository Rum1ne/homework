import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int a = 11, b = 2;
        int count = 0;
        for (int i = 1; i<=n; ++i) {
            if (i%2==1) {
                a *= 3;
            }                            //с доп условиями волки умирают к 210 месяцу...
            if (i%2==0) {
                a -= 10*b;
                count += 10*b;
            }
            while (count >= 70) {
                b += 1;
                count -= 70;
            }
        }
        System.out.println(a + " " + b);
    }
}
