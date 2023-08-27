public class NestedWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5){ // 1<=5 = true, 2<=5 = true
            int j = 1; // 1
            while(j<=5){ // 1<=5, 2<=5, 3<=5, 4<=5, 5<=5, 6
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
