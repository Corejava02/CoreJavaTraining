public class BankAccountMain {
    static int amount =10000;
    public void Deposit(int depositAmt){
        amount = amount +depositAmt;
        System.out.println(amount);
        System.out.println("Deposit amount is  " +depositAmt);
    }
    public void withdraw(int WithdrawAmt){
        amount = amount -WithdrawAmt;
        System.out.println(amount);
        System.out.println("Withdraw amout is  " +WithdrawAmt);
    }
    public  void inquiry(){
        System.out.println(amount);
    }
    public static void main(String[] args) {
        BankAccountMain bankAccountExp=new BankAccountMain();
        bankAccountExp.withdraw(500);
        System.out.println(amount);
    }
}
