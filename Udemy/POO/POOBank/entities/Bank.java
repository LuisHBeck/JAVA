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

    public Bank(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }


    public void setDeposit(double deposit) {
        this.balance += deposit;
    }

    public void setWithdraw(double withdraw) {
        this.balance -= withdraw + 5;
    }

    public double getBalance() {
        return balance;
    }

    public void print(){
        System.out.printf("Account: %d, Holder: %s, Balance: R$%.2f\n", getAccountNumber(), getAccountHolder(), getBalance());
    }
}
