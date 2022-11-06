import java.util.Scanner;

public class yep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fraction1:");
        Fraction fraction1 = new Fraction(18, 30);
        System.out.println(fraction1);
        System.out.println(fraction1.toDecimal());

        System.out.println();
        System.out.println("Fraction2:");
        Fraction fraction2 = new Fraction(7);
        System.out.println(fraction2);
        System.out.println(fraction2.toDecimal());

        System.out.println();
        System.out.println("Fraction3:");
        Fraction fraction3 = new Fraction();
        System.out.println(fraction3);
        System.out.println(fraction3.toDecimal());

        System.out.println();
        System.out.println("Fraction4");
        Fraction fraction4 = new Fraction("12/7");
        System.out.println(fraction4);
        System.out.println(fraction4.toDecimal());

        System.out.println();
        System.out.println("Fraction 5");
        Fraction fraction5 = new Fraction(12.06);
        System.out.println(fraction5);
        System.out.println(fraction5.toDecimal(12.06));



    }
}