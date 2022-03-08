package luka.Calculator;

public class CalculatorLogic {

    double a;
    double b;

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

}
