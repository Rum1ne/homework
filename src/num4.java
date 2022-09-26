import java.util.Locale;
import java.util.Scanner;
public class num4 {
    public static void main(String[] args) {
        Scanner dot = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double n = dot.nextDouble();
        System.out.println((-2<=n && n<=3 || 6<=n && n<=9)? false : true);
    }
}