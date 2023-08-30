public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 1},
                {2, 5, 9},
                {3, 7, 6}};
        int b[][] = {
                {10, 1, 6},
                {7, 6, 2},
                {9, 1, 5}};
        int c[][] = new int[3][3];

        for(int i=0;i<3;i++){ // i =0, 1
            for(int j=0;j<3;j++){ // j =0, 1, 2
                for(int k=0;k<3;k++){ // k=0, 1, 2 || 0, 1, 2
                    c[i][j] = c[i][j]+(a[i][k]*b[k][j]);
                }
            }
        }

    }
}
