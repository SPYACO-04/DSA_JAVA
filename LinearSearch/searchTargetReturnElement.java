package LinearSearch;

import static java.lang.System.*;

public class searchTargetReturnElement {
    static void main(String[] args) {
        int[] arr = {12,74,6,47,576,34,75,64,764};
        int target = 764;
        int ans = linearSearch2(arr, target);
        out.println("value :"+ans);
        out.println(" index : "+linearSearch(arr, target));
    }

    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return -1;
    }
    static int linearSearch(int[] arr, int targeet ){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            //check for element at every index if it is = target
            int element = arr[i];
            if(element == targeet){
                return i;
            }
        }
        return -1;
    }
}
