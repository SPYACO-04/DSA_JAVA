package Strings;
import java.util.Arrays;

public class StringMethodsEx {
    static void main(String[] args) {
        String s= "SurajPanda";

        String ans = Arrays.toString(s.toCharArray());
        System.out.println(ans);

        System.out.println(s.toLowerCase());
        System.out.println(s);
        System.out.println(s.indexOf('a'));
        System.out.println("     Suraj   ".strip());
        System.out.println(Arrays.toString(s.split(" ")));
    }
}
