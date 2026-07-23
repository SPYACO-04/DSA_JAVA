package Arrays;

public class max {
    static void main(String[] args) {
        int[] arr = {1223,324,345, 754, 6356, 4656};
        System.out.println(maxRange(arr,1,arr.length));
    }

    static int maxRange (int[] arr, int start, int end){
        if(end < start){
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int maxval = arr[0];
        for(int i= 1; i<arr.length; i++){
            if(arr[i]>maxval){
                maxval=  arr[i];
            }
        }
        return maxval;
    }

    static int max(int[] arr, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        int maxval = arr[0];
        for(int i= 1; i<arr.length; i++){
            if(arr[i]>maxval){
                maxval=  arr[i];
            }
        }
        return maxval;
    }
}
