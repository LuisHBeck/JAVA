package POOBank.application;

import POOBank.entities.Bank;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Bank x;

        System.out.print("Input account number>> ");
        int accountNum = tec.nextInt();

        System.out.print("Input account holder>> ");
        String accountHolder = tec.next();

        System.out.print("Is there an initial deposit? (Y/N)>> ");
        String resp = tec.next().toUpperCase();

        while (true){
            if (resp.equals("Y")){
                System.out.print("Input the initinal deposit value>> R$");
                double balance = tec.nextDouble();
                x = new Bank(accountNum, accountHolder, balance);
                break;
            } else if (resp.equals("N")) {
                x = new Bank(accountNum, accountHolder);
                break;
            }else {
                System.out.print("Wrong answer! Just (Y/N)>> ");
                resp = tec.next().toUpperCase();
            }
        }

        System.out.println(" ");
        System.out.println("Account data: ");
        x.print();

        System.out.println(" ");
        System.out.print("Input a deposit value>> R$");
        x.setDeposit(tec.nextDouble());
        System.out.println("Account update: ");
        x.print();

        System.out.println(" ");
        System.out.print("Input a withdraw value>> R$");
        x.setWithdraw(tec.nextDouble());
        System.out.println("Account update: ");
        x.print();
    }
}
