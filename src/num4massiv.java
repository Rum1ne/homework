import java.util.Scanner;

public class num4massiv {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n-1; ++i) {
            if (numbers[i] < numbers[i-1]) {
                System.out.println(numbers[i-1]);
            }
        }
    }
}