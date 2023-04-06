package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 5;

        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);

        }
        int subtractResult = calculator.subtract(a,b);
        boolean correctSubtract = ResultChecker.assertEquals(3, subtractResult);
        if (correctSubtract) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squareResult = calculator.square(a);
        boolean correctsquare = ResultChecker.assertEquals(32768, squareResult);
        if(correctsquare){
            System.out.println("Metoda square działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczb " + a + " i " + b);
        }

    }
}
