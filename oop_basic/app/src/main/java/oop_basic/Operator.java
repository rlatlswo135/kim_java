package oop_basic;

import java.util.Arrays;

public enum Operator {
    PLUS("+") {
        @Override
        public int calculate(int target1, int target2) {
            return target1 + target2;
        }
    },
    MINUS("-") {
        @Override
        public int calculate(int target1, int target2) {
            return target1 - target2;
        }
    },
    MULTI("*") {
        @Override
        public int calculate(int target1, int target2) {
            return target1 * target2;
        }
    },
    DEVI("/") {
        @Override
        public int calculate(int target1, int target2) {
            return target1 / target2;
        }
    };

    private final String operator;

    private Operator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public abstract int calculate(int target1, int target2);

    public static int calculate(int target1, String operator, int target2) {
        Arrays.stream(values());
        return 0;
    };
}