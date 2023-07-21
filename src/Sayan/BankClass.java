import java.util.Scanner;

public class BankClass {
    public static void main(String args[])
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Withdrawn      2. Deposite      3. Balance Check");
        System.out.println("Enter The Choice = ");
        choice = sc.nextInt();

        BankAccount ba = new BankAccount();
        switch(choice)
        {
            case 1: ba.Withdrawn();
                    break;

            case 2: ba.Deposit();
                    break;

            case 3: ba.Balance();
                    break;

            default: System.out.println("Wrong Choice !!! Enter The Right Choice ...");
        }
    }
}

class BankAccount
{
    float total=100000;

    public float Withdrawn()
    {
        float amt;
        Scanner wd = new Scanner(System.in);

        System.out.println("Enter The Amount = ");
        amt = wd.nextFloat();

        if(amt>total)
        {
            System.out.println("Not Enough Cash in Your Account.");
        }
        else
        {
            total = total-amt;
            System.out.println("After Withdrawal, The Total Amount = "+total);
        }
        return total;
    }

    public float Deposit()
    {
        float amt;
        Scanner wd = new Scanner(System.in);

        System.out.println("Enter The Amount = ");
        amt = wd.nextFloat();

        total = total+amt;
        System.out.println("After Deposit, The Total Amount = "+total);

        return total;   
    }

    public float Balance()
    {
        System.out.println("The Total Balance in The Account = "+total);
        return total;
    }
}
