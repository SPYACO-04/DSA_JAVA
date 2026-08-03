package Binary_Search;
//Q. 852 or
public class PeakOnMountainArray {
    static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int ans = peakIndexInMountainArray( arr);
        System.out.println(ans);
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
 }
