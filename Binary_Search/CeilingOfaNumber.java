package Binary_Search;

public class CeilingOfaNumber {
    static void main(String[] args) {
        int[] arr = {-32,-12,-1,12,32,43,54,56,65,67,68,73,76,93};
        int target = 36;
        int ans = celing(arr,target);
        System.out.println(ans);
    }
//return index : smallest element greater than target
    static int celing(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target > arr.length - 1){
            return -1;
        }
        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid+ 1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
