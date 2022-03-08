package kristina.calculator;

public class CalculatorAdvanced extends Calculator {

    @Override
    public String operationType() {
        return super.operationType() + ", **, %";
    }

    @Override
    public double calculate() {

        if(operation.equals("**")) {
            return Math.pow(a, b);
        } else if (operation.equals("%")) {
            return a % b;
        }

        return super.calculate();
    }
}
