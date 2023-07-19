package Sumit;

public class TriangleEven {
    public static void main(String[] args) {
        int i=2;
        for(int r=1;r<=4;r++)
        {
            for(int c=1;c<=r;c++)
            {
                System.out.print(i+" ");
                i+=2;
            }
            System.out.println();
        }
    }
}
