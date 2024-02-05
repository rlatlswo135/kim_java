package oop_basic.interfaceOperator;

public class NewOperatorClass3 implements NewOperator {
    @Override
    public boolean supports(String operator) {
        return "*".equals(operator);
    }

    @Override
    public int calculate(int target1, int target2) {
        return target1 * target2;
    }

}
