package kristina.calculator;

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

    public double calculate() {

        double result = 0;

        if (operation.equals("+")) {
            result = a + b;
        } else if (operation.equals("-")) {
            result = a - b;
        } else if (operation.equals("/")) {
            result = a / b;
        } else if (operation.equals("*")) {
            result = a * b;
        } else {
            return 0;
        }
        return result;
    }
}
