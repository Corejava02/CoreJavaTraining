/*
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
 */
public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
                int result=1;
                for (int j = 10; j >= i; j--) {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(result+" ");
                    result=result*(i-j)/(j); // 0
                }
                System.out.println();
        }
    }
}
