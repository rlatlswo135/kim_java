package tdd_test.PasswordValidatorTest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tdd_test.PasswordGenerator.PasswordGenerator;

import tdd_test.PasswordValidator.PasswordValidator;
import static org.assertj.core.api.Assertions.assertThatCode;

// NOTICE : 경계값에 대한 테스트를 반드시 하자 -> 아래의경우 7,13이 되겠다

public class PasswordValidatorTest {
    @Test
    @DisplayName("비밀번호가 8자 이상 12자이하면 예외가 발생하지 않는다.")
    void validatePasswordTest(){
        assertThatCode(() -> PasswordValidator.validate("12345678")).doesNotThrowAnyException();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1234567","1234567890123"})
    @DisplayName("비밀번호가 8자 미만 12자 초과면 IllegalArgumentException이 발생한다.")
    void validatePasswordTest2(String password){
        assertThatCode(() -> PasswordValidator.validate(password)).isInstanceOf(IllegalArgumentException.class).hasMessage(PasswordValidator.EXCEPTION_MESSAGE);
    }

    @DisplayName("올바른 패스워드")
    void wrongPasswordTest(PasswordGenerator generator){
        String password = generator.generate();
        assertThatCode(() -> PasswordValidator.validate(password)).doesNotThrowAnyException();
    }
}
