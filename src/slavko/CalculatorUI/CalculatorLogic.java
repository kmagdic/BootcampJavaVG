package slavko.CalculatorUI;

public class CalculatorLogic {

    private double a;
    private double b;
    String operation;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double calculate() {

        switch(operation){
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