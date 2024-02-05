package oop_basic;

public class Calculator {
    static int calculate(int arg1, String operator, int arg2) {
        switch (operator) {
            case "+":
                return arg1 + arg2;
            case "-":
                return arg1 - arg2;
            case "*":
                return arg1 * arg2;
            case "/":
                return arg1 / arg2;
            default:
                return arg1;
        }
    }
}
