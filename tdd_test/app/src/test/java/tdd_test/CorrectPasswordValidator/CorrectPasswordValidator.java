package tdd_test.CorrectPasswordValidator;

import tdd_test.PasswordGenerator.PasswordGenerator;

public class CorrectPasswordValidator implements PasswordGenerator {
    @Override
    public String generate(){
        return "12345678";
    }
}
