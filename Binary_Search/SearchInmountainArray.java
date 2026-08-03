package Binary_Search;
//Q. 1095
public class SearchInmountainArray {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 4;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // We are in the ascending part
                // Peak is on the right
                start = mid + 1;
            } else {
                // We are in the descending part
                // Peak may be mid or on the left
                end = mid;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){
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
//
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        // Find peak
//        int peak = peakIndexInMountainArray(mountainArr);
//        // Search in ascending part
//        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
//        if (firstTry != -1) {
//            return firstTry;
//        }
//        // Search in descending part
//        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);
//        }
//    static int peakIndexInMountainArray(MountainArray arr) {
//        int start = 0;
//        int end = arr.length() - 1;
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            if (arr.get(mid) < arr.get(mid + 1)) {
//                    // Ascending part
//                    // Peak is on the right
//                start = mid + 1;
//            } else {
//                // Descending part
//                // Peak may be mid or on the left
//                end = mid;
//            }
//        }
//        return start;
//        }static int orderAgnosticBS(MountainArray arr,
//                int target,
//                int start,
//                int end) {
//
//            boolean isAsc = arr.get(start) < arr.get(end);
//
//            while (start <= end) {
//
//                int mid = start + (end - start) / 2;
//
//                if (arr.get(mid) == target) {
//                    return mid;
//                }
//
//                if (isAsc) {
//
//                    // Ascending
//                    if (target < arr.get(mid)) {
//                        end = mid - 1;
//                    } else {
//                        start = mid + 1;
//                    }
//
//                } else {
//                    // Descending
//                    if (target > arr.get(mid)) {
//                        end = mid - 1;
//                    } else {
//                        start = mid + 1;
//                    }
//                }
//            }
//            return -1;
//        }
//    }
}
