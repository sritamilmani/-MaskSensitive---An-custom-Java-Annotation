package org.example;


public class User {
    private String username;

    @MaskSensitive
    private String password;

    @MaskSensitive
    private String creditCard;

    public User(String username, String password, String creditCard) {
        this.username = username;
        this.password = password;
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return MaskingUtil.maskSensitiveData(this);
    }

}

