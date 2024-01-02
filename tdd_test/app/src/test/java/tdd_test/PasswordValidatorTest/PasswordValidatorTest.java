package tdd_test.PasswordValidatorTest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tdd_test.PasswordValidator.PasswordValidator;
import static org.assertj.core.api.Assertions.assertThatCode;

public class PasswordValidatorTest {
    @Test
    @DisplayName("비밀번호가 8자 이상 12자이하면 예외가 발생하지 않는다.")
    void validatePasswordTest(){
        assertThatCode(() -> PasswordValidator.validate("qwerasdf")).doesNotThrowAnyException();
    }
}
