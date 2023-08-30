import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PIN:");
        int pin = sc.nextInt();
        BankAccount ob = new BankAccount();
        int i = 0;
        while (i != 1) {
            System.out.println("Enter 1 to deposit, 2 to withdrawal, 3 to balance inquiry and 4 to terminate");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    ob.deposit(pin);
                    break;
                case 2:
                    ob.withdrawal(pin);
                    break;
                case 3:
                    ob.balance(pin);
                default:
                    System.out.println("TERMINATED...");
                    i = 1;
                    break;
            }
        }
    }
}

class BankAccount {
    void deposit(int pin) {
        Scanner sc = new Scanner(System.in);
        if (pin == 123) {
            System.out.println("Enter acc no.");
            String acc = sc.next();
            System.out.println("Drop your cash...");
            System.out.println("Deposit successfully in account number: " + acc);
        } else {
            System.out.println("Wrong PIN...");
        }
    }

    void withdrawal(int pin) {
        Scanner sc = new Scanner(System.in);
        if (pin == 123) {
            System.out.println("Enter withdrawal amount:");
            int cash = sc.nextInt();
            System.out.println("Transaction Sucessful...");
        } else {
            System.out.println("Wrong PIN...");
        }
    }

    void balance(int pin) {
        if (pin == 123) {
            System.out.println("Your balance is:");
        } else {
            System.out.println("Wrong PIN...");
        }
    }
}
