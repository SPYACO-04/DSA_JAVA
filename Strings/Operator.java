package Strings;

import java.util.ArrayList;

public class Operator {
    static void main(String[] args) {

        System.out.println('a' + 'b');// for Charecter o/p :  'a' + 'b' (97 + 98 = 195)
        System.out.println("a" + "b");// for String o/p : ab
        System.out.println((char)('a' + 3));// o/p : 'a' + 3 ( 97 + 3 = 100 )
        System.out.println("a" + 1); // "a1"

        System.out.println("suraj" + new ArrayList<>());
        System.out.println("suraj" + new  Integer(23));
    }
}
