import java.util.Arrays;

public class MyArrays {
    public static double avgOf4Digit(int[] numbers) {
        double sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (1000 <= num && num <= 9999) {
                ++count;
                sum += num;
            }
        }
        sum /= count;
        return (1000 <= sum && sum <= 9999 ? sum : -1.00);
    }


    public static int[] minToBegin(int[] numbers) {
        int number = 0;                                  //индекс минимального числа
        int min = numbers[0];
        for (int i = 0; i < numbers.length; ++i) {
            if (min > numbers[i]) {
                min = numbers[i];
                number = i;
            }
        }
        int[] result = new int[numbers.length];
        result[0] = min;
        for (int i = 0; i < number; ++i) {
            result[i + 1] = numbers[i];
        }
        for (int k = number + 1; k < numbers.length; ++k) {
            result[k] = numbers[k];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 8, 1000, 9, 3000};
        System.out.println(avgOf4Digit(numbers));
        int[] num = {8, 7, 5, 4, 2};
        System.out.println(Arrays.toString(minToBegin(num)));        //тут идея помогла
    }
}

