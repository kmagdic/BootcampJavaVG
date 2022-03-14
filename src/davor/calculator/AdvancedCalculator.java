package davor.calculator;

public class AdvancedCalculator extends Calculator {
    @Override
    public double calculate() {
        if(operator.equals("%"))
            return a % b;
        if(operator.equals("**"))
            return Math.pow(a,b);
        else
            return super.calculate();
    }
}
