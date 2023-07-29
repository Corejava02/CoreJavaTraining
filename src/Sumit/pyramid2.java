package Sumit;

public class pyramid2 {
    public static void main(String[] args) {
        int p=1,i=0;
        for(int r=1;r<=4;r++)
        {
            /*for(int c=4;c>=r;c--)
            {
                System.out.print("*");
            }*/
                     i=r;

            for(int c=1;c<=p;c++)
            {
                if(i<(r+c)-1){
                System.out.print(i+" ");
                i=i+1;
                }
                else{
                    i=i-1;
                    System.out.println(i+" ");
                }
            }
            System.out.println();
            p+=2;
        }
    }
}
