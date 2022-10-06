package stringcalculator;

public class DivideCommand implements Command {

    @Override
    public Number execute(Number leftNumber, Number rightNumber) {
        return leftNumber.divide(rightNumber);
    }
}