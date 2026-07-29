package Binary_Search;

public class OrderAgnoasticBS {
    static void main(String[] args) {
//      int[] arr = {-32,-12,-1,12,32,43,54,56,65,67,68,73,76,93};
        int [] arr = {213,32,4535,543,6,34,2,342,24,245};
        int target = 342;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

//      find whether the array is sorted iin assending or dessending
        boolean isAsc = arr[start] <arr[end];


        while(start <= end){
//          midd
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }

            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else if(target < arr[mid]){
                    start = mid+ 1;
                }
            }
        }
        return -1;
    }

}
