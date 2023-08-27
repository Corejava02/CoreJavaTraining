public class Transpose {
    public static void main(String[] args) {
        int a[][] = {
                {1, 2},
                {3, 5},};
        int b[][] = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j] = a[j][i];
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
