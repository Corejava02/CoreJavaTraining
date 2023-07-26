package Sumit;

import java.util.Scanner;

public class library {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter PIN:");
    int pin=sc.nextInt();
    BankAccount ob=new BankAccount();
    int i=0;
    while(i!=1){
    System.out.println("Enter 1 to deposit, 2 to withdrawal, 3 to balance inquiry and 4 to terminate");
    int key=sc.nextInt();
    switch (key) {
        case 1:
            ob.deposit(pin);
            break;
            case 2:
            ob.withdrawal(pin);
            break;
            case 3:
            ob.balance(pin);
            break;
        default:
        System.out.println("TERMINATED...");
        i=1;
            break;
    }
    }
}
}
class Book
{
    int totlbk=100
    void borrow()
    {
        System.out.println("Enter borrower name:");
        String bnm=sc.next();
        System.out.println("Enter bookcode:");
        String bkc=sc.next();
        
    }
    void return()
    {

    }
    void addBook()
    {

    }
    void history()
    {

    }
}
