package luka.Calculator;

public class CalculatorLogic {

    private double a;
    private double b;
    private double c;
    private double d;

    String oper;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double calculate() {
        switch(oper){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "*":
                return a * b;
            default :
                return 0;
        }
    }
    public double calculatefour() {
        switch(oper){
            case "+":
                return a + b + c + d;
            case "-":
                return a - b - c - d;
            case "/":
                return a / b / c / d;
            case "*":
                return a * b * c * d;
            default :
                return 0;
        }
    }

}
