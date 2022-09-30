import java.util.Scanner;
public class num4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int i = 9;
        while (n>0) {
            if (i>n%10 && n%10!=0) {
                i = n%10;
                n /=10;
            }
            else {
                n /=10;
            }
        }
        System.out.println(i);

    }
}