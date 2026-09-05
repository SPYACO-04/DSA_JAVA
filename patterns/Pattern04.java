package patterns;

public class Pattern04 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n ){
        for (int r = 1; r <= n; r++){ // for every row run the col
            for(int c = 1; c <= r; c++){
                System.out.print(c+ " ");
            }
            //when one row is printed, we need to add a new line
            System.out.println();
        }
    }
}
