import java.util.Scanner;
public class num3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if (n == 11 || n == 12 || n == 13 || n == 14) {
            System.out.println(n + " TORTOV");
        }
        else {
            switch (n%10) {
                case 0:
                    System.out.println(n + " TORTOV");
                    break;
                case 1:
                    System.out.println(n + " TORT");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(n + " TORTA");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(n + " TORTOV");

            }
        }


    }
}
