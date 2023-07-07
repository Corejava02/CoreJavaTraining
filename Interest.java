import java.util.*;
public class Interest 
{
    public static void main(String[] args) 
    {
        double p, r, t, interest, cinterest;
        int n;
        Scanner it = new Scanner(System.in);
        
        System.out.println("Enter The Principal = ");
        p = it.nextDouble();
        System.out.println("Enter The Rate = ");
        r = it.nextDouble();
        System.out.println("Enter The Year = ");
        t = it.nextDouble();
        System.out.println("Enter The Number of Times The Interest is compounded = ");
        n = it.nextInt();

        interest = (p * r * t) / 100;
        cinterest = (p * (Math.pow((1 + r / 100), (t * n)))) - p;

        System.out.println("The Simple Interest = "+interest);
        System.out.println("The Compound Interest = "+cinterest);
    }
}
