package stringcalculator.command;

import stringcalculator.domain.Number;

public class MinusCommand implements Command {

    @Override
    public Number execute(Number leftNumber, Number rightNumber) {
        return leftNumber.minus(rightNumber);
    }

    @Override
    public String toString() {
        return "연산: -";
    }
}
