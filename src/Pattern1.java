/*
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
 */

public class Pattern1 {
    public static void main(String[] args) {
        int n=0;
        for(int i=0;i<=10;i++){
            int coef = 1;
            for(int j=10; j>=i; j--){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(coef + " ");
                coef = coef * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
