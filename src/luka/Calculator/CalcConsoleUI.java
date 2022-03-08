package luka.Calculator;

import java.util.Scanner;

public class CalcConsoleUI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculatorLogic calc = null;

        System.out.println("Odaberite kalkulator : 1 obicni , 2 : napredni .");
        int type = scanner.nextInt();
        if (type == 1) {
            calc = new CalculatorLogic();
        } else {
            calc = new CalculatorAdvanced();
        }


        System.out.println("Unesite a : ");
        double a = scanner.nextDouble();

        System.out.println("Unesite b : ");
        double b = scanner.nextDouble();

        System.out.println("Unesite operaciju : ");
        String oper = scanner.next();

        calc.setA(a);
        calc.setB(b);
        calc.setOper(oper);

        System.out.println("Rezultat je : " + calc.calculate());

    }
}
