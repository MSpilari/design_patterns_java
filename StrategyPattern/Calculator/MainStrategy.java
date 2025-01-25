package Calculator;

public class MainStrategy {
    public static void main(String[] args) {
        Calculator calculatorSum = new Calculator(2, 3, "sum");
        Calculator calculatorMultiply = new Calculator(2, 3, "multiply");
        Calculator calculatorDivision = new Calculator(2, 3, "division");
        Calculator calculatorSubtract = new Calculator(2, 3, "subtraction");
        Calculator calculatorInvalid = new Calculator(2, 3, "invalid");

        calculatorSum.result();
        calculatorMultiply.result();
        calculatorDivision.result();
        calculatorSubtract.result();
        calculatorInvalid.result();
    }
}
