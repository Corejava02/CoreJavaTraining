package Sumit;

public class Floyd {
    public static void main(String[] args) {
        int i=1;
        for(int r=1;r<=4;r++)
        {
            for(int c=1;c<=r;c++)
            {
                System.out.print(i);
                i++;
            }
            System.out.println();
        }
    }
}
