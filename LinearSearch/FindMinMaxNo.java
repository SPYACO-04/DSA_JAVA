package LinearSearch;

public class FindMinMaxNo {
    static void main(String[] args) {
        int[] arr = {12,23,4,32,54,534 ,345, 534, 242222};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    static int max(int[] arr){
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}
