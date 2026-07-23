package Arrays;

import java.util.Arrays;

public class PassingFunctions {
    static void main() {

        int[] nums = {3,4,35,54,23};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 23;
    }
}
