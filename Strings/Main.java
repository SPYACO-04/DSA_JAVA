package Strings;

public class Main {
    static void main(String[] args) {
        int[] arr = {2,3, 4, 5, 6 , 7}; // Array declaration
        String name = "Suraj Panda"; //String declaration

        String a = "suraj";
        String b = "suraj";
        System.out.println((a+" "+b));
        System.out.println(a == b);

        a ="surajpanda";
        System.out.println(a);

        String m = new String("Mahesh");
        String n = new String("Mahesh");

        System.out.println(m.equals(n)); //It checks value

    }
}
