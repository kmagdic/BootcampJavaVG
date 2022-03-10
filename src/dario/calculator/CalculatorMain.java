package dario.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator;

        System.out.println("Welcome to Calculator");
        System.out.println("Do you want to use basic calculator (1) or Advanced Calculator (2)");
        int choice = scanner.nextInt();
        if (choice == 1) {
            calculator = new Calculator();
        } else {
            calculator = new AdvancedCalc();
        }

        System.out.println("Supported operations are: " + calculator.supportedOps());

        System.out.print("A: ");
        calculator.setA(scanner.nextDouble());

        System.out.print("B: ");
        calculator.setB(scanner.nextDouble());

        System.out.println("Operation");
        try {
        calculator.setOper(scanner.next());
        System.out.println("Result: " + calculator.calculate());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };

    }
}
