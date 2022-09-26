import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        int num1 = nums.nextInt();
        int num2 = nums.nextInt();                        //этот ещё хуже вышел фу
        int num3 = nums.nextInt();
        System.out.println((100<=num1 && num1<=999 && num1%5==0 && 100<=num2 && num2<=999 && num2%5==0 ||
                100<=num1 && num1<=999 && num1%5==0 && 100<=num3 && num3<=999 && num3%5==0 ||
                100<=num3 && num3<=999 && num3%5==0 && 100<=num2 && num2<=999 && num2%5==0 ||
                -999<=num1 && num1<=-100 && num1%5==0 && -999<=num2 && num2<=-100 && num2%5==0 ||
                -999<=num1 && num1<=-100 && num1%5==0 && -999<=num3 && num3<=-100 && num3%5==0 ||
                -999<=num3 && num3<=-100 && num3%5==0 && -999<=num2 && num2<=-100 && num2%5==0)? true : false );
    }
}