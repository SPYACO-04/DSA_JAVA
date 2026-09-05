package patterns;

public class pattern01 {
    static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n ){
        for (int r = 1; r <= n; r++){ // for every row run the col
            for(int c = 1; c <= r; c++){
                System.out.print(" * ");
            }
            //when one row is printed, we need to add a new line
            System.out.println();
        }
    }
}
