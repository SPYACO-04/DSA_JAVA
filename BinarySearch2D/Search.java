package BinarySearch2D;

public class Search {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int target = 7;

        int[] ans = search(arr, target);

        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }

    static int[] search(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (arr[row][col] == target) {
                return new int[]{row, col};
            }

            if (arr[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}