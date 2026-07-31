package Binary_Search;

// Q. 744

public class NextGretterLetter {
    static void main(String[] args) {
        char [] letter = {'c', 'f', 'j'};
    }
    static int celing(char[] letter, char target){
        int start = 0;
        int end = letter.length - 1;


        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < letter[mid]){
                end = mid - 1;
            }
            else {
                start = mid+ 1;
            }
        }
        return letter[start % letter.length];
    }
}
