package davor.calculator;

import java.util.Scanner;

public class CalcConsoleUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite a : ");
        double a = scanner.nextDouble();

        System.out.println("Unesite b : ");
        double b = scanner.nextDouble();

        System.out.println("Unesite operaciju : ");
        String operator = scanner.next();

        Calculator calc = new Calculator();
        calc.setA(a);
        calc.setB(b);
        calc.setOperator(operator);

        System.out.println("Rezultat je : " + calc.calculate());

    }

}