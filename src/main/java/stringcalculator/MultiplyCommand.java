package stringcalculator;

public class MultiplyCommand implements Command {

    @Override
    public Number execute(Number leftNumber, Number rightNumber) {
        return leftNumber.multiply(rightNumber);
    }
}