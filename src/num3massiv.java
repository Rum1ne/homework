import java.util.Scanner;

public class num3massiv {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[] numbers = new int[n];
        int min = numbers[0];
        for (int i  = 0; i < n; ++i) {
            if (min > 0 && numbers[i] < min && numbers[i] > 0|| min <= 0 && numbers[i] > min && numbers[i] > 0) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
