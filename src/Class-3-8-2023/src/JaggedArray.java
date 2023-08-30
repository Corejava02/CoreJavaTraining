public class JaggedArray {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6}};
        int a1[][][] = {
                {
                        {1,2,3},
                        {2,3,4}
                },
                {
                        {4,5,6},
                        {1},
                        {2,3}
                }
        };
        for(int[][] i:a1){
            for(int[] j:i){
                for(int k:j){
                    System.out.println(k);
                }
            }
        }
    }
}
