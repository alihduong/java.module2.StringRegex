package com.baiTap.ValidateNameClass;


public class ClassNamesTest {
    public static final String[] validClass = new String[] {"C1021H"};
    public static final String[] invalidClass = new String[] {"M0318G", "P0323A"};

    public static void main(String[] args) {
        ClassNames classNames = new ClassNames();
        for (String className : validClass){
            boolean isValid = classNames.validate(className);
            System.out.println("Class Name: " + className + "is valid: " + isValid);
        }

        for (String className : invalidClass){
            boolean invalid = classNames.validate(className);
            System.out.println("Email: " + className + "is valid: " + invalid);
        }
    }
}
