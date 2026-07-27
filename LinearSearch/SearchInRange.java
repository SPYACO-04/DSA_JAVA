package LinearSearch;

public class SearchInRange {
    static void main(String[] args) {
        int[] arr= {12,324,43,4,453,234,2423};
        int target = 84;
        System.out.println(Search(arr, target, 1, 4));
    }
    static int Search(int[] arr, int target, int start, int end ){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i < end; i++){
            //check for element at every index if it is = target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
