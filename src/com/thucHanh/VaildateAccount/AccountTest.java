package com.thucHanh.VaildateAccount;

public class AccountTest {
    private static final String[] validAccounts = new  String[]
            {"123abc_","_abc123", "______","123456","hoangduongdz"};
    private static final String[] invalidAccounts = new String[]
            {".@", "1234", "ABCDEF"};

    public static void main(String[] args) {
        Account account = new Account();
        for (int i = 0; i < validAccounts.length; i++) {
            String accounts = validAccounts[i];
            boolean isValid = account.validate(accounts);
            System.out.println("Email: " + accounts + "is valid: " + isValid);
        }
        for (String accounts : invalidAccounts){
            boolean isValid = account.validate(accounts);
            System.out.println("Email: "+accounts +"is valid: " + isValid);
        }
    }
}
