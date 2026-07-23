package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][2];
        System.out.println(arr.length);

//        int[][] arr2D = {
//                {1,2,3},//0th index
//                {4,5},//1st index
//                {6,7,8,9}//2nd index
//        };
//        System.out.println(arr2D);
        //input
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

//        System.out.println(Arrays.toString(arr));

        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
