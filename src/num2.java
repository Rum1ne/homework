import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int f = 0;                          //число которое выведется в конце
        while(n != 0){
            f = f*10 + n%10;
            n /= 10;
        }
        System.out.println(f);
    }
}
