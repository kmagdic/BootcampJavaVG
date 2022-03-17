package kristina.calculator;

import java.util.InputMismatchException;

public class Calculator {

    double a;
    double b;
    String operation;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String operationType() {
        return "+, -, /, *";
    }

    public double calculate() throws Exception {
        try {

        double result = 0;

            if (operation.equals("+")) {
                result = a + b;
            } else if (operation.equals("-")) {
                result = a - b;
            } else if (operation.equals("/")) {
                if (a == 0 || b == 0) {
                    throw new Exception("Nije moguće dijeljenje s nulom!");
                }
                else {result = a / b; }
            } else if (operation.equals("*")) {
                result = a * b;
            }
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Ne može se dijeliti s nulom!");
        } catch (InputMismatchException e) {
            System.out.println("Unesite cijeli broj!");
        return 0;
    }
        return 0;
    }
}
