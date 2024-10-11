package se.lexicon;

public class Main {
    public static void main(String[] args) {


        // ClassName.methodName();
        ConsoleCalculator.runCalculator();
        try {
            System.out.println(MathOperations.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        /*System.out.println(MathOperations.add(1, 8, 1));



        System.out.println(MathOperations.subtract(1, 2));
         */

    }
}