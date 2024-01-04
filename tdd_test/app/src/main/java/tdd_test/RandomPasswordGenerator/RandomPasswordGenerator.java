package tdd_test.RandomPasswordGenerator;

import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class RandomPasswordGenerator {
    private static final String ALLOWED_SPL_CHARACTER = "!@#$%^&*()_+";
    private static final String ERR_CODE = "ERROR_SPACIAL_CHARS";


    public String generate(){
        PasswordGenerator gen = new PasswordGenerator();
    
        CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
        CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars,2);
    
        CharacterData upperCaseChars = EnglishCharacterData.UpperCase;
        CharacterRule upperCaseRule = new CharacterRule(upperCaseChars,2);
    
        CharacterData digitCaseChars = EnglishCharacterData.Digit;
        CharacterRule digitCaseRule = new CharacterRule(digitCaseChars,2);

        CharacterData specialChars = new CharacterData() {
            public String getErrorCode(){
                return ERR_CODE;
            }
            public String getCharacters(){
                return ALLOWED_SPL_CHARACTER;
            }
        };

        CharacterRule specialCaseRule = new CharacterRule(specialChars,2);


        String result = gen.generatePassword(12,lowerCaseRule,upperCaseRule,digitCaseRule,specialCaseRule);
        return result;
    }
}
