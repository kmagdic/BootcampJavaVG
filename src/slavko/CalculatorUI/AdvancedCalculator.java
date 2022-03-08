package slavko.CalculatorUI;

public class AdvancedCalculator extends CalculatorLogic {

    @Override
    public double calculate() {
        if (operation.equals("**")) {
            return Math.pow(a, b);
        } else if (operation.equals("MIN")) {
            return Math.min(a, b);
        } else {
            return super.calculate();
        }
    }
}
