package Sumit;

public class Pyramid {
    public static void main(String[] args) {
        int p=1;
        for(int i=1;i<=5;i+=1)
        {
            for(int c=4;c>=i;c--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=p;j+=1)
            {
                System.out.print("*");
            }
            System.out.println();
            p+=2;
        }
    }
}
