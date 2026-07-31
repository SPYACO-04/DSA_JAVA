package Binary_Search;

public class FloorOfaNo {
    static void main(String[] args) {
        int[] arr = {-32,-12,-1,12,32,43,54,56,65,67,68,73,76,93};
        int target = 55;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    //return index : greatest of smaller than target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
//                return arr[mid];
            }
            else if(target > arr[mid]){
                start = mid+ 1;
//                return arr[mid];
            }
            else{
                return mid;
//                return arr[mid];
            }
        }
        return end;
    }

}
