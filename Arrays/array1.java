package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        arr[0] = 23;
        arr[1] = 12;
        arr[2] = 42;
        arr[3] = 54;
        arr[4] = 42;
        //[23,12, 42, 54, 42]
        System.out.println(arr[3]);

//        for(int  i = 0; i < arr.length; i++){
//            arr[i]=in.nextInt();
//        }

//        for(int  i = 0; i < arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }

//        for(int num : arr){
//            System.out.println(num + " ");
//        }
//        System.out.println(Arrays.toString(arr));

        String[] str = new String[5];
        for(int i = 0; i < str.length; i++ ){
            str[i] =in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
