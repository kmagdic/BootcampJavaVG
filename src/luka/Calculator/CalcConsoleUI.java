package luka.Calculator;

import java.util.Scanner;

public class CalcConsoleUI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite a : ");
        double a = scanner.nextDouble();

        System.out.println("Unesite b : ");
        double b = scanner.nextDouble();

        System.out.println("Unesite c : ");
        double c = scanner.nextDouble();

        System.out.println("Unesite d : ");
        double d = scanner.nextDouble();

        System.out.println("Unesite operaciju : ");
        String oper = scanner.next();

        CalculatorLogic calc = new CalculatorLogic();
        calc.setA(a);
        calc.setB(b);
        calc.setOper(oper);

        System.out.println("Rezultat je : " + calc.calculate());

        CalculatorLogic calc4 = new CalculatorLogic();
        calc4.setA(a);
        calc4.setB(b);
        calc4.setC(c);
        calc4.setD(d);
        calc4.setOper(oper);

        System.out.println("Rezultat je : " + calc4.calculatefour());
    }
}
