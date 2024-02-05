package oop_basic.interfaceOperator;

public class PositiveNumber {
    private final int VALUE;

    public PositiveNumber(int value) {
        this.VALUE = value;
    }

    private void validate(int value) {
        if (isNagativeNumber(value)) {
            throw new IllegalArgumentException("음수입니다.");
        }
    }

    private boolean isNagativeNumber(int value) {
        return value <= 0;
    }

    public int getPositiveNumber() {
        return VALUE;
    }
}
