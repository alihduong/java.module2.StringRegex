package com.thucHanh.Email;

public class EmailRegexTest {
    public static final String[] validEmail = new String[] {"alihduong@gmail.com", "ab@yahoo.com","abc@giday.com"};
    public  static  final String[] invalidEmail = new String[] {"@gmail.com", "ba@gmail.", "%$#b@gmail.com"};

    public static void main(String[] args) {
        EmailRegex emailRegex = new EmailRegex();
        for (String email : validEmail){
            boolean isValid = emailRegex.validate(email);
            System.out.println("Email: "+email +"is valid: " + isValid);
        }
        for (String email : invalidEmail){
            boolean inValid = emailRegex.validate(email);
            System.out.println("Email: "+email +"is valid: " + inValid);
        }
    }
}
