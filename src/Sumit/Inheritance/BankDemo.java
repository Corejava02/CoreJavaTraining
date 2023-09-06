package Sumit.Inheritance;

import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolder;

    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Rs" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String accountHolder, double interestRate) {
        super(accountNumber, balance, accountHolder);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest of Rs" + interest + " applied to account " + getAccountNumber());
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, String accountHolder, double overdraftLimit) {
        super(accountNumber, balance, accountHolder);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount or exceeds overdraft limit.");
        }
    }
}
public class BankDemo {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the accountno., balance, accountHolderName:,InterestRate:");
        String accountNumber=sc.next();
        double balance=sc.nextDouble();
        String accountHolder=sc.next();
        double interst=sc.nextDouble();
        sc.nextLine();
         System.out.println("Enter the accountno., balance, accountHolderName:,OverDraftLimit:");
        String accountNumber2=sc.next();
        double balance2=sc.nextDouble();
        String accountHolder2=sc.next();
        double overdraft=sc.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, balance, accountHolder, interst);
        CheckingAccount checkingAccount = new CheckingAccount(accountNumber2, balance2, accountHolder2, overdraft);
        savingsAccount.deposit(200);
        savingsAccount.applyInterest();
        savingsAccount.displayAccountDetails();
        checkingAccount.withdraw(200);
        checkingAccount.displayAccountDetails();
    }
}

