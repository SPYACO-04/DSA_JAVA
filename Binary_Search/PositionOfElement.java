package Binary_Search;

public class PositionOfElement {

    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 170};

        int target = 10;

        int ans = findingRange(arr, target);

        System.out.println(ans);
    }

    static int findingRange(int[] arr, int target) {

        // Start with a box of size 2
        int start = 0;
        int end = 1;

        // Find the range in which target can exist
        while (target > arr[end]) {

            int temp = end + 1;

            // Double the box size
            end = end + (end - start + 1) * 2;

            start = temp;
        }

        // Search inside the found range
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}