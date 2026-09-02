package Strings;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;

public class StringPalindrome {
    static void main(String[] args) {
        String str = "abccba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String a){
        if(a == null ||a.length() == 0 ){
            return true;
        }
        a = a.toLowerCase();
        for(int i = 0; i < a.length() / 2; i++){
            char start = a.charAt(i);
            char end = a.charAt(a.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
