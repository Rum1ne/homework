import java.util.Scanner;
public class num1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int d = num.nextInt();        //число которое нужно удалить
        int f = 0;                    //число которое выведется в конце
        int count = 0;
        while (n > 0) {
            if (n % 10 != d) {
                ++count;
                f += n%10 * Math.pow(10, count-1);
                n /= 10;
            }
            else {
                n /= 10;
            }
        }
        System.out.println(f);
;   }
}