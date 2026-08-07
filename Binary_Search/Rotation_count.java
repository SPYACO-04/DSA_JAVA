package Binary_Search;

public class Rotation_count {
    static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotation(arr));
    }
    static int countRotation(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }
    public int search(int[] nums, int target){
        int pivot = findPivot(nums);
        //if u do not find pivot,it means the array is not roatated
        if(pivot == -1){
            //just normal BS
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target,  0, nums.length - 1);
        }
        return binarySearch(nums, target, pivot +1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

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
        return -1;
    }
    //this will not work for duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            //4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            //if elements at middle, start, end are equal then just skip the duplicate
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip duplicate
                //NOTE : what if these elements at start and werw the pivot ??
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                if(arr[end] > arr[end + 1]){
                    return end - 1;
                }
                end --;
            }
            //left side is sorted so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
