package tdd_test.PasswordValidator;
import java.lang.IllegalArgumentException;

public class PasswordValidator {
    public static void validate(String password){
        int passwordLength = password.length();

      if(passwordLength > 12 || passwordLength < 8){
        throw new IllegalArgumentException("8자 이상, 12자 이하가 아닙니다.");
      }
    }
}
    