import java.util.Scanner;

public class NumberDigits {
    public static int sumOfSeven(int a, int b) {
        int sum = 0;
        for (int i = a; i < b; ++i) {
            if (i % 7 == 0 && 10 <= i && i <= 99) {
                sum += i % 10 + i / 10;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(sumOfSeven(in.nextInt(), in.nextInt()));

    }
}

