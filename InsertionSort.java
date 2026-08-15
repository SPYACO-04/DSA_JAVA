package Sorting;

import java.util.Arrays;
public class InsertionSort {
    static void main(String[] args) {


            int[] arr = {5, 3, 4, 1, 2};

            insertionSort(arr);

            System.out.println(Arrays.toString(arr));
    }
        static void insertionSort(int[] arr) {

            for (int i = 1; i < arr.length; i++) {

                int key = arr[i];
                int j = i - 1;

                // Move bigger elements one position ahead
                while (j >= 0 && arr[j] > key) {

                    arr[j + 1] = arr[j];
                    j--;
                }

                // Put key at its correct position
                arr[j + 1] = key;
            }
        }
}
