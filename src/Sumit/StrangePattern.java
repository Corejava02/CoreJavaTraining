package Sumit;
/**
 * StrangePattern
 */
public class StrangePattern {

    public static void main(String[] args) {
        int p=1,r=1;
        for(int i=1;i<=5;i++){
            for(int j1=4;j1>=i;j1--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=p;j++){
                if(j<=i)
                {
                    System.out.print(+r);
                    r=r+1;
                }
                else{
                    r=r-1;
                    System.out.print(+(r-1));
                }
            }
            System.out.println();
            p=p+2;
        }
    }
}