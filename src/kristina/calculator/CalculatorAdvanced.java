package kristina.calculator;

import java.util.zip.Adler32;

public class CalculatorAdvanced extends Calculator {

    @Override
    public String operationType() {
        return super.operationType() + ", **, %";
    }

    @Override
    public double calculate() throws Exception {
        try {
            if (operation.equals("**")) {
                return Math.pow(a, b);
            } else if (operation.equals("%")) {
                return a % b;
            }

            return super.calculate();
        } catch (Exception e) {
            System.out.println("Ne može se dijeliti s nulom!");
        }
        return 0;
    }
}
