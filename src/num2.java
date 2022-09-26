import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner all = new Scanner(System.in);
        int r = all.nextInt();
        int k = all.nextInt();
        int n = all.nextInt();
        System.out.println((r * n + k * n/100) + " " + (k * n%100));

    }
}
