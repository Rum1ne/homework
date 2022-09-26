import java.util.Scanner;
public class num3 {
    public static void main(String[] args) {
        Scanner seconds = new Scanner(System.in);
        int n = seconds.nextInt();
        String hour = (n / 3600) + ":";
        int min = n / 60 % 60;
        int sec = n % 60;
        String m = "00";
        if (min < 10) {
            m = "0" + min + ":";                      //некрасивый код вышел :с
        } else {
            m = min + ":";
        }
        String s = "00";
        if (sec < 10) {
            s = "0" + sec;
        } else {
            s = sec + " ";
        }
        System.out.println(hour + m + s);
    }
}
