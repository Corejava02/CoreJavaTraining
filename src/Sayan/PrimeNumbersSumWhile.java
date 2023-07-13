
public class PrimeNumbersSumWhile
{
    public static void main(String[]args)
    {
        int num=1, temp=0;
        
        while(num<=1000)
        {
            int i=2, c=0;
            while(i<=num/2)
            {
                if(num%i==0)
                {
                    c++;
                }   
            i++;
            }
        
            if (c==0 && num!=1)
            {
                temp=temp+num;
            }
            num++;
        }
        System.out.println("The Sum of Prime Numbers between 0-1000 is = "+temp);
    }
}