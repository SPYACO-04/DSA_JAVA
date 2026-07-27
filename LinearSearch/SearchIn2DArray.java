package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    static void main(String[] args) {
        int[][] arr = {
                {12, 43, 46, 7},
                {54, 65, 645},
                {454, 69, 24,795, 268},
                {35,99,61}
        };
        int target = 645;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target ){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){

                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int[] max(int[][] arr){
        int max = Integer.MAX_VALUE;
        for(int[] ints : arr){
            for(int element : ints){

               max = element;
            }
        }
        return new int[]{-1, -1};
    }
}
