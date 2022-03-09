package markob.calculator;

public class CalculatorLogic {
    double a;
    double b;
    String operatus;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setOperatus(String operatus) {
        this.operatus = operatus;
    }

    public double calculate() {
        return 0;
      /*  return switch (operatus) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };*/
    }
}
