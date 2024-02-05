package oop_basic;

import java.util.List;

import oop_basic.interfaceOperator.NewOperator;
import oop_basic.interfaceOperator.NewOperatorClass;
import oop_basic.interfaceOperator.NewOperatorClass2;
import oop_basic.interfaceOperator.NewOperatorClass3;
import oop_basic.interfaceOperator.NewOperatorClass4;
import oop_basic.interfaceOperator.PositiveNumber;

class Test {
    int value;

    public Test(int value) {
        this.value = value;
    }

    public void test() {
        System.out.println("테스트");
    }
}

public class InterfaceCalculator {
    private static final List<NewOperator> interfaceOperators = List.of(new NewOperatorClass(), new NewOperatorClass2(),
            new NewOperatorClass3(), new NewOperatorClass4());

    public static int _calculate(int target1, String operator, int target2) {
        PositiveNumber t1 = new PositiveNumber(target1);
        PositiveNumber t2 = new PositiveNumber(target2);

        Test t3 = new Test(3) {
            @Override
            public void test() {
                System.out.println("테스트2");
            }
        };

        Test t4 = () -> System.out.println("테스트3"); // no 익명객체로 인스턴스를 만드는 과정 다체를 람다로하는게아니라 "함수형 인터페이스"를 가지고 익명객체를 써서
                                                    // 인스턴스만드는 과정을 람다로 대체할수 있다는거.

        return interfaceOperators.stream()
                .filter(v -> v.supports(operator))
                .map(v -> v.calculate(t1, t2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올지않음"));
    }
}
