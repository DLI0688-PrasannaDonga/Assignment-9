package Rethrowing;

public class RethrowingException {
    public static void performDivision(int numerator, int denominator) {
        try {
            if (denominator == 0)
                throw new ArithmeticException();
            else
                System.out.println(numerator / denominator);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void calculate(int numerator, int denominator) {
        try {
            performDivision(numerator, denominator);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main(String[] args) {

        try {
            performDivision(4, 0);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero");
        }

    }
}