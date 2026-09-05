package patterns;

public class Pattern08 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int r = 1; r <= 2*n; r++){

            int c = r > n ? 2*n - r : r;
            for (int space = 0; space < n-c; space++){
                System.out.print("  ");
            }


            for (int col = c; col >= 1; col-- ){
                System.out.println(col + " ");
            }
            for (int col = 2; col <= c; col++){

            }

        }
    }
}
