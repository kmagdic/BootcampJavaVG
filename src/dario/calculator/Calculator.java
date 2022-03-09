package dario.calculator;

public class Calculator {
    double a;
    double b;
    String oper;
    String opSup = "+, -, *, /, %";

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public String supportedOps() {
        return this.opSup;
    }

    public double calculate() {
        switch(oper) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "%":
                return a % b;
            default:
                return 0;
        }

    }
}
