package Calculator;

import java.util.Map;

public class Calculator {

    private final double firstValue;
    private final double secondValue;
    private final String operation;
    private Map<String, OperationStrategy> mapStrategies = Map.of("sum", new AdditionStrategy(),
            "subtraction", new SubtractionStrategy(),
            "multiply", new MultiplyStrategy(),
            "division", new DivisionStrategy());

    public Calculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public void result() {
        OperationStrategy operationStrategy = mapStrategies.get(operation);
        if (operationStrategy == null) {
            System.out.println("The " + operation + " is invalid");
            return;
        }
        double result = operationStrategy.execute(firstValue, secondValue);
        System.out.println("The " + operation + " between " + firstValue + " and " + secondValue + " is " + result);
    }
}
