package markob.calculator;

public class CalcLogicExtended extends CalculatorLogic{

    @Override
    public double calculate() {
        if (operatus.equals("%")) {
            return a % b;
        } else if (operatus.equals("**")) {
            return Math.pow(a, b);
        }
        return super.calculate();
    }
}
