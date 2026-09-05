package patterns;

public class Pattern06 {
    static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n ){
        for (int r = 1; r <= 2*n-1 ; r++){
            int tcol = r > n ? 2*n - r : r;

            int noofSpaces = n - tcol;
            for(int s = 0; s < noofSpaces; s++){
                System.out.print(" ");
            }

            for(int c = 0; c < tcol; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
