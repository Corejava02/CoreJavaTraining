public class MatrixAddition {
    public static void main(String[] args) {
        int result;
        int arr1[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int arr2[][] = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}};

        int res[][] = new int[3][3];

        for(int i=0;i<3;i++){ // i=0, 1, 2, 3
            for(int j=0;j<3;j++){ // j=0, 1, 2, 3 || 0, 1, 2, 3 || 0 1 2 3
                res[i][j]=arr1[i][j] + arr2[i][j];
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }

//        int arr[] = {1,2,3,4};
//        int arr1[] = new int[5];
//
//        for(int i=0;i<4;i++){
//            System.out.println(arr[i]);
//        }

//        for (int i = 0; i < 3; i++) { // i=0, j=0,1,2 || i=1, j=0,1,2 || i=2, j=0,1,2
//            for(int j=0;j<3;j++){
//                System.out.print(arr1[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
