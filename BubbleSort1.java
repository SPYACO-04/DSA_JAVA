package BubbleSort;

import java.util.Arrays;

public class BubbleSort1 {
    static void main(String[] args) {
        int[] arr = {1,2,2,54,57,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        boolean swapped;
        //run for step n-1
        for(int i =0; i<arr.length ; i++){
            swapped = false;
            //for each step, max item wil come at the last respective index
            for(int j = 1; j< arr.length - i; j++){
//                swap if the item is similar then the privious item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){//!false = true
                break;
            }
        }
    }
}
