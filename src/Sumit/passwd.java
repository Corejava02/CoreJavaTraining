import java.util.Scanner;

public class passwd {
    public static void main(String[] args) {
     Scanner  sc=new Scanner(System.in);
     System.out.println("Enter the username:");
     String usrnm=sc.next();
     System.out.println("Enter the password:");
     String pwd=sc.next();
     if(usrnm.equals("admin") && pwd.equals("password123"))
     {
        System.out.println("ACCESS GRANTED...");
     }
     else
     {
        System.out.println("ACCESS DENIED...");
     }
    }
}
