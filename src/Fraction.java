public class Fraction { // обыкновенная дробь
    private int numerator = 0;
    private int denominator = 1;

    Fraction(int numerator, int denominator) {
        System.out.println("1: I am constructor with numerator " + numerator + " denominator " + denominator);
        if (denominator == 0) {
            System.out.println("Divide by zero!!!");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    Fraction(int numerator) {
        this.numerator = numerator;
        System.out.println("2: I am constructor with numerator " + numerator);
    }

    Fraction() {
        System.out.println("3: I am an empty constructor");

    }

    Fraction(String fr) {
        String denom = "";
        String num = "";
        for (int i = 0; i < fr.length(); ++i) {
            String a = String.valueOf(fr.charAt(i));
            if (a.equals("/")) {
                num = denom;
                denom = "";
            } else denom += a;
        }
        numerator = Integer.parseInt(num);
        denominator = Integer.parseInt(denom);
        System.out.println("4: I am a constructor with fraction" + fr);
    }

    Fraction(double fr) {
        System.out.println("I am a constructor with an unknown normal fraction :(");
    }

    double toDecimal(double fr) {
        return fr;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    double toDecimal() {
        return (double) numerator / denominator;
    }

    private int getGcd() {
        int a = numerator;
        int b = denominator;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    void normalize() {
        int gcd = getGcd();
        numerator /= gcd;
        denominator /= gcd;
    }

    int sum = 0;
    int previous_detominator = 1;
    int previous_numerator = 0;

    public void sum(int numerator, int denominator) {
        if (previous_detominator == denominator) {
            sum += numerator / denominator;
        } else {
            sum = (previous_numerator / previous_detominator * getLcm() + numerator / denominator * getLcm()) / getLcm();
        }
    }

    int mult = 1;

    public void mult(int numerator, int denominator) {
        mult *= (double) numerator /denominator;
    }


    private int getGcd(int previous_detominator, int denominator) {
        int a = previous_detominator;
        int b = denominator;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    private int getLcm() {
        int a = previous_detominator;
        int b = denominator;
        return a * b / getGcd(a, b);
    }
}

