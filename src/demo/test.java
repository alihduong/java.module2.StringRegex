package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String y = "5\\d-[A-Z]\\d-((\\d{4})|(\\d{3}\\.\\d{2}))";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher = pattern.matcher(y);
        System.out.println(pattern);
    }
}
