package oop_basic.interfaceOperator;

public class NewOperatorClass4 implements NewOperator {
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber target1, PositiveNumber target2) {
        if (target2.getPositiveNumber() == 0) {
            /*
             * 인터페이스로 operator를 만들었을때의 응집도. -> 양수 판단여부도 클래스를 만들어서 재이용
             * 즉 객체지향으로 잘 작성을 했다면 == "책임"에 따른 분리가 잘 되어있다면.
             * 0으로 나누었을때 Exception을 원하는 테스트코드가 있을시.
             * 나눗셈에 해당하는 객체 (NewOperatorClass4)에 해당하는 코드만 수정하면 되겠구나. 라는 응집도가 생기게 되는것
             */
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return target1.getPositiveNumber() / target2.getPositiveNumber();
    }

}
