public class ForLoopTriangle1 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){ // i=0 0<5, i=1 1<5, i=2
            for(int j=0;j<=i;j++){ // j=0  0<=0, j=1 1<=0, j=0 0<=1, j=1, 1<=1, j=2, 2<=1, j=0 1<=2
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
