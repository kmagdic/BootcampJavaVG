package dario.calculator;

public class AdvancedCalc extends Calculator {
    @Override
    public String supportedOps() {
        return super.supportedOps() + "**, min, max, hypot => sqrt(x2 +y2)";
    }

    @Override
    public double calculate() throws Exception {
        if (oper.equals("**")) {
            return Math.pow(a, b);
        } else if (oper.equals("min")) {
            return Math.min(a, b);
        } else if (oper.equals("max")) {
            return Math.max(a, b);
        } else if (oper.equals("hypot")) {
            return Math.hypot(a, b);
        } else {
            return super.calculate();
        }
    }
}
