package tdd_test.UserTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tdd_test.User.User;

public class UserTest {
    @Test
    @DisplayName("User 패스 워드 init 여부")
    void initPasswordTest(){
        User user = new User();

        user.initPassword();

        assertThat(user.getPassword()).isNotNull();
    }
}
