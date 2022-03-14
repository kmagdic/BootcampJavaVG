package vedran.calculator;

public class Calculator {

    double a;
    double b;
    String operator;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculate() throws Exception {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                if (b == 0) {
                    throw new Exception("Division by zero");
                } else {
                    return a / b;
                }
            case "*":
                return a * b;
            default:
                throw new Exception("Unknown operation");
        }
    }
}