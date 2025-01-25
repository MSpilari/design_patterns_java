package Calculator;

public class SubtractionStrategy implements OperationStrategy {

    @Override
    public double execute(double firstValue, double secondValue) {
        return firstValue - secondValue;

    }

}
