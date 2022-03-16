package kristina.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorUI {

    public static void main(String[] args) throws Exception {
        try {

        Scanner scanner = new Scanner(System.in);

        Calculator calc = new Calculator();

        String menu = "";

        System.out.println("Odaberite kalkulator: 1 - osnovni, 2 - napredni, 3 - exit");
        menu = scanner.next();

            switch (menu) {
                case "1":
                    calc = new Calculator();

                case "2":
                    calc = new CalculatorAdvanced();

                case "3":
                    break;
            }

            while (true) {
                System.out.println("Podržane operacije su: " + calc.operationType());
                System.out.println("Enter expression inf format <a> <operation> <b>");
                calc.setA(scanner.nextDouble());
                calc.setOperation(scanner.next());
                calc.setB(scanner.nextDouble());

                System.out.println(calc.a + " " + calc.operation + " " + calc.b);
                System.out.println("Result is: " + calc.calculate());
            }
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Ne može se dijeliti s nulom");
        } catch (InputMismatchException e) {
            System.out.println("Unesite cijeli broj!");
        }
    }
}
