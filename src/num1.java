import java.util.Scanner;
public class num1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int m = n/100 + n/10%10 + n%10;
        System.out.println(m + " " + (m + 2 - n%2));
    }
}