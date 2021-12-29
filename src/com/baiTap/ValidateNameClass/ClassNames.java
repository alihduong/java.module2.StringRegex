package com.baiTap.ValidateNameClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNames {
//    Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
//    Không chứa các ký tự đặc biệt
//    Theo sau ký tự bắt đầu là 4 ký tự số
//    Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String CLASS_NAME_REGEX = "^[C,A,P]\\d{4}[G, H, I, K, L, M]";
    public ClassNames (){
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
