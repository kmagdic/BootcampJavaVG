package slavko.CalculatorUI;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorLogic calculator = null;

        System.out.println("CHOOSE CALCULATOR: 1. BASIC, 2. ADVANCED");
        int type = scanner.nextInt();
        if (type == 1) {
            calculator = new CalculatorLogic();
        } else if (type == 2) {
            calculator = new AdvancedCalculator();
        }

        System.out.println("ENTER NUMBER A : ");
        double a = scanner.nextDouble();

        System.out.println("ENTER NUMBER B : ");
        double b = scanner.nextDouble();

        System.out.println("OPERATION : ");
        String operation = scanner.next();

        calculator.setA(a);
        calculator.setB(b);
        calculator.setOperation(operation);
        calculator.calculate();

        System.out.println("RESULT: " + calculator.calculate());
    }
}
