package oop_basic.interfaceOperator;

public class NewOperatorClass2 implements NewOperator {
    @Override
    public boolean supports(String operator) {
        return "-".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber target1, PositiveNumber target2) {
        return target1.getPositiveNumber() - target2.getPositiveNumber();
    }

}
