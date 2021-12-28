package com.thucHanh.Email;
import java.util.regex.*;
public class EmailRegex {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX =  "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public EmailRegex(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
