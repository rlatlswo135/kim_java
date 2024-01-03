package tdd_test.User;

import tdd_test.RandomPasswordGenerator.RandomPasswordGenerator;

public class User {
    private String password;

    public void initPassword(){
        RandomPasswordGenerator gen = new RandomPasswordGenerator();

        String randomPassword = gen.generate();

        System.out.println(randomPassword);

        if(randomPassword.length() >= 8 && randomPassword.length() <= 12){
            this.password = randomPassword;
        }
    }


    public String getPassword(){
        return this.password;
    }
}
