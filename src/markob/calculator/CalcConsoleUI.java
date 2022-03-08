package markob.calculator;

import dario.calculator.Calculator;

import java.util.Scanner;

public class CalcConsoleUI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        CalculatorLogic basic = null;
        
        System.out.println("Odaberite kalkulator: 1 za obični ili 2 za napredni: ");

        int typeCalc = scanner.nextInt();
        if (typeCalc == 1) {
            basic = new CalculatorLogic();
        } else if (typeCalc == 2) {
            basic = new CalcLogicExtended();
        }

        System.out.println("Unesite prvi broj: ");
        double a = scanner.nextDouble();

        System.out.println("Unesite matematičku operaciju: ");
        String operatus = scanner.next();

        System.out.println("Unesite drugi broj: ");
        double b = scanner.nextDouble();

        basic.setA(a);
        basic.setB(b);
        basic.setOperatus(operatus);

        System.out.println("Rezultat je: " + basic.calculate());

    }
}
