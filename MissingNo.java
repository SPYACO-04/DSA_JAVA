package Sorting;

import java.util.Arrays;

//Q. 268
class MissingNo{
    static void main(String[] args) {
        int[] nums ={3,0,1};
        int  ans = missingNos(nums);
        System.out.println(ans);
    }
    static int missingNos(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else{
                i ++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
}