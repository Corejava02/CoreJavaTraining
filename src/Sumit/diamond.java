package Sumit;

public class diamond {
    public static void main(String[] args) {
        int p=1,q=7;
        for(int r=1;r<=5;r+=1)
        {
            for(int c1=4;c1>=r;c1--)
            {
                System.out.print(" ");
            }
            for(int c2=1;c2<=p;c2+=1)
            {
                System.out.print("*");
            }
            
            p+=2;
            
            System.out.println();
        }
        for(int r=1;r<=5;r+=1)
        {
            for(int c1=1;c1<=r;c1++)
            {
                System.out.print(" ");
            }
            for(int c2=q;c2>=1;c2-=1)
            {
                System.out.print("*");
            }
            q-=2;
            System.out.println();
        }
            
        }
    }

