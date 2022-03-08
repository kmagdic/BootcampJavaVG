package kristina.calculator;

import java.util.Scanner;

public class CalculatorUI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculator calc = new Calculator();

        Calculator calcAdvanced = new Calculator();

        System.out.println("Upišite broj a: ");
        calc.setA(scanner.nextDouble());

        System.out.println("Upišite operaciju: ");
        calc.setOperation(scanner.next());

        System.out.println("Upišite broj b: ");
        calc.setB(scanner.nextDouble());

        System.out.println("Result is: " + calc.calculate());

        System.out.println("Enter expression inf format <a> <operation> <b>");
        calcAdvanced.setA(scanner.nextDouble());
        calcAdvanced.setOperation(scanner.next());
        calcAdvanced.setB(scanner.nextDouble());

        System.out.println(calcAdvanced.a + " " + calcAdvanced.operation + " " + calcAdvanced.b);

        System.out.println("Result is: " + calcAdvanced.calculate());

    }

}
