package patterns;

public class Pattern05 {
    static void main(String[] args) {
        pattern1(5);
    }
    static void pattern(int n ){
        for (int r = 1; r <= n ; r++){ // for every row run the col
            for(int c = 1; c <=r ; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int r = 0; r<=n; r++ ){
            for(int c = 0; c <= n-2-r; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n ){
        for (int r = 1; r <= 2*n-1 ; r++){
            int tcol = r > n ? 2*n - r : r;
            for(int c = 0; c < tcol; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
