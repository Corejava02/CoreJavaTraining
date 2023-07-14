package Sumit;

public class Pascal {
    public static void main(String[] args) {
        
        for(int r=1;r<=4;r++)
        {
            int i=1;
            for(int c=1;c<=r;c++)
            {
                System.out.print(i);
                i=i*(r-c)/c;  
                ;
            }
            System.out.println();
        }
    }
}
