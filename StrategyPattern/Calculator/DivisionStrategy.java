package Calculator;

public class DivisionStrategy implements OperationStrategy {

    @Override
    public double execute(double firstValue, double secondValue) {
        if (secondValue == 0) {
            throw new ArithmeticException("Error: Zero division not allowed.");
        }
        return firstValue / secondValue;
    }
}
