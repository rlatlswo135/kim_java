package tdd_test.PasswordValidator;
import java.lang.IllegalArgumentException;

public class PasswordValidator {
    public static final String EXCEPTION_MESSAGE = "비밀번호는 8자 이상 12자 이하여야 합니다.";

    public static void validate(String password){
        int passwordLength = password.length();

      if(passwordLength > 12 || passwordLength < 8){
        throw new IllegalArgumentException(EXCEPTION_MESSAGE);
      }
    }

    public static void validate2(String password){
        int passwordLength = password.length();

        if(passwordLength > 12 || passwordLength < 8){
            throw new IllegalArgumentException(EXCEPTION_MESSAGE);
        }
    }
}
    