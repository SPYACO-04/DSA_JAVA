package Sorting;
//Q.448
import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    static void main(String[] args) {
       ;
    }

    static List<Integer> missingno(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if( nums[i] != nums[correct]){
                int temp =  nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }else {
                i++;
            }
        }
        //find missing numbers :
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index ++){
            if(nums[index] != index + 1){
                ans.add(index+1);
            }
        }
        return ans;
    }
}
