package slavko.CalculatorUI;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER NUMBER A : ");
        double a = scanner.nextDouble();

        System.out.println("ENTER NUMBER B : ");
        double b = scanner.nextDouble();

        System.out.println("OPERATION : ");
        String operation = scanner.next();

        CalculatorLogic calculator = new CalculatorLogic();

        calculator.setA(a);
        calculator.setB(b);
        calculator.setOperation(operation);
        calculator.calculate();

        System.out.println("RESULT: " + calculator.calculate());
    }
}
