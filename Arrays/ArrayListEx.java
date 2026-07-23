package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListEx {
    static void main() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(32);
//        list.add(21);
//        list.add(64);
//        list.add(54);
//        list.add(432);
//        list.add(23);
//        System.out.println(list);
//        System.out.println(list.isEmpty());
//        list.set(0,3212);
//        System.out.println(list);
//
        for(int i = 0; i<5;i++){
            list.add(in.nextInt());
        }

        for(int i = 0; i<5; i++){
            System.out.println(list.get(i));
        }
    }
}
