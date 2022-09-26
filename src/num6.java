import java.util.Locale;
import java.util.Scanner;

public class num6 {
    public static void main(String[]args){
        Scanner loc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double x = loc.nextDouble();
        double y = loc.nextDouble();
        System.out.println((y>=x && y<=2-x*2)? "YES" : "NO");
    }
}
