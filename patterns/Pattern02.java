package patterns;

public class Pattern02 {
    static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for(int r= 1; r<= n; r++){
            for(int c = 1; c<=n; c++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
