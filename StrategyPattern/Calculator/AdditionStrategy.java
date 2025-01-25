package Calculator;

public class AdditionStrategy implements OperationStrategy {

    @Override
    public double execute(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

}
