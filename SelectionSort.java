package Sorting;
import java.util.Arrays;

public class SelectionSort  {
    static void main(String[] args) {
        int[] arr = {1,2,54,57,3,4,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        for(int i =0; i<arr.length ; i++){
            //find max item in the remaing array and swap with correct index
            int last = arr.length - i - 1;
            int max = getMAxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMAxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i =start; i<= end ; i++){
            if(arr[max]< arr[i]){
                max = i;
            }
        }return  max;
    }
}
