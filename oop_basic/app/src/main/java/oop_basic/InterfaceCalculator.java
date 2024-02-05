package oop_basic;

import java.util.List;

import oop_basic.interfaceOperator.NewOperator;
import oop_basic.interfaceOperator.NewOperatorClass;
import oop_basic.interfaceOperator.NewOperatorClass2;
import oop_basic.interfaceOperator.NewOperatorClass3;
import oop_basic.interfaceOperator.NewOperatorClass4;

public class InterfaceCalculator {
    private static final List<NewOperator> interfaceOperators = List.of(new NewOperatorClass(), new NewOperatorClass2(),
            new NewOperatorClass3(), new NewOperatorClass4());

    public static int _calculate(int target1, String operator, int target2) {
        return interfaceOperators.stream()
                .filter(v -> v.supports(operator))
                .map(v -> v.calculate(target1, target2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올지않음"));
    }
}
