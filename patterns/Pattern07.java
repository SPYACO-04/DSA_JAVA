package patterns;

public class Pattern07 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int r = 1; r <= n; r++){

            for (int space = 0; space < n- r; space++){
                System.out.print("  ");
            }
           for (int c = r; c >= 1; c--){
               System.out.print(c+" ");
           }
           for (int c = 2; c <= r; c++){
               System.out.print(c+" ");
           }
            System.out.println();
        }
    }
}
