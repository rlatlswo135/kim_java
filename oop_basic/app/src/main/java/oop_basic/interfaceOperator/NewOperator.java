package oop_basic.interfaceOperator;

public interface NewOperator {
    boolean supports(String operator);

    int calculate(PositiveNumber target1, PositiveNumber target2);
}
