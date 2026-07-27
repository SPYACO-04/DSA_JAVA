package LinearSearch;

public class fstEx {
    static void main(String[] args) {
        int[] arr = {12,74,6,47,576,34,75,64,764};
        int target = 423;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    //searching on the array
    //otherwise return -1

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
