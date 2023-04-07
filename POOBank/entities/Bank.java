package POOBank.entities;

public class Bank {
    private int accountNumber;
    private String accountHolder;
    private double deposit;
    private double withdraw;
    private double balance;


    public Bank(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getBalance() {
        return balance + deposit - withdraw;
    }

    public void print(){
        System.out.printf("Account: %d, Holder: %s, Balance: R$%.2f\n", accountNumber, accountHolder, getBalance());
    }
}
