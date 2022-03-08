package luka.Calculator;

public class CalculatorAdvanced extends CalculatorLogic {
    @Override
    public double calculate() {
        if (oper.equals("**")) {
            return Math.pow(a, b);
        }
        if (oper.equals("min")) {
            return Math.min(a, b);
        }
        if (oper.equals("max")) {
            return Math.max(a, b);
        }
        if (oper.equals("povpravtrok"))  {
            return (a*b) / 2;
        }
        return super.calculate();
    }
}
