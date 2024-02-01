package oop_basic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 1. 간단한 사칙연산 가능
 * 2. 0으로 나눗셈시 IllegalArgumentException
 * 3. 양수로만 계산
 * 4. MVC패턴 사용
 */

public class CalculatorTest {
    @DisplayName("사칙 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculateTest(int arg1, String operator, int arg2,int result){
        assertThat(Calculator.calculate(arg1,operator,arg2)).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult(){
        return Stream.of(
            Arguments.arguments(1, "+", 2, 3),
            Arguments.arguments(3, "-", 1, 2),
            Arguments.arguments(1, "*", 2, 2),
            Arguments.arguments(4, "/", 2, 2)
        );
    }
}