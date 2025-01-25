package Calculator;

public class MultiplyStrategy implements OperationStrategy {

    @Override
    public double execute(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }
}
