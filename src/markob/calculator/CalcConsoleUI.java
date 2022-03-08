package markob.calculator;

import java.util.Scanner;

public class CalcConsoleUI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double a = scanner.nextDouble();

        System.out.println("Unesite matematičku operaciju: ");
        String operatus = scanner.next();

        System.out.println("Unesite drugi broj: ");
        double b = scanner.nextDouble();

        CalculatorLogic basic = new CalculatorLogic();

        basic.setA(a);
        basic.setB(b);
        basic.setOperatus(operatus);

        System.out.println("Rezultat je: " + basic.calculate());

        CalculatorLogic basic1 = new CalculatorLogic();

        System.out.println("Unesite 2 broja i operaciju: ");
        basic1.setA(scanner.nextDouble());
        basic1.setB(scanner.nextDouble());
        basic1.setOperatus(scanner.next());

        System.out.println("Rezultat je: " + basic1.calculate());
    }
}
