package stringcalculator.domain;

public class StringArithmeticInput {
    private static final String DELIMITER = " ";

    private final String input;

    public StringArithmeticInput(String input) {
        if (input == null || input.equalsIgnoreCase("")) {
            throw new IllegalArgumentException("공백은 불가능합니다");
        }

        this.input = input;
    }

    public Number evaluate() {
        String[] expression = input.split(DELIMITER);
        ArithmeticExpression arithmeticExpression = new ArithmeticExpression();

        for (String value : expression) {
            arithmeticExpression = arithmeticExpression.append(value);
            arithmeticExpression = evaluateIfCompleted(arithmeticExpression);
        }

        return arithmeticExpression.getResult();
    }

    private ArithmeticExpression evaluateIfCompleted(ArithmeticExpression arithmeticExpression) {
        if (arithmeticExpression.complete()) {
            return arithmeticExpression.evaluate();
        }

        return arithmeticExpression;
    }
}
