package dario.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Welcome to Calculator");
        System.out.println("Supported operations are: " + calculator.supportedOps());

        System.out.print("A: ");
        calculator.setA(scanner.nextDouble());

        System.out.print("B: ");
        calculator.setB(scanner.nextDouble());

        System.out.println("Operation");
        calculator.setOper(scanner.next());


        System.out.println("Result: " + calculator.calculate());

    }
}
