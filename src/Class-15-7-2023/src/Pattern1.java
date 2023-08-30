/*
    2
    4 6
    8 10 12
    14 16 18 20
 */

public class Pattern1 {
    public static void main(String[] args) {
//        int size = 4;
//        int N = 2;
//        for (int i = 1; i <= size; i++) {
//            for (int j = 1; j <= size; j++) {
//                if (j <= i) {
//                    System.out.print(N+" ");
//                    N = N + 2;
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

    }
}
