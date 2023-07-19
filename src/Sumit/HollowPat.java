package Sumit;

public class HollowPat {
    public static void main(String[] args) {
        for(int r=0;r<5;r++)
        {
            for(int c=0;c<5;c++)
            {
                if(r>0&&r<4&&c>0&&c<4)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                    
            }
            System.out.println();
        }
    }
}
