package tdd_test.WrongPasswordValidator;

import tdd_test.PasswordGenerator.PasswordGenerator;

public class WrongPasswordValidator implements PasswordGenerator {
    @Override
    public String generate(){
        return "12345";
    }
}
