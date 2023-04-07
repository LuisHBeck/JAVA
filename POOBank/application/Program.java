package POOBank.application;

import POOBank.entities.Bank;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Input account number>> ");
        int accountNum = tec.nextInt();

        System.out.print("Input account holder>> ");
        String accountHolder = tec.next();

        System.out.print("Is there an initial deposit? (Y/N)>> ");
        String resp = tec.next().toUpperCase();

        double balance = 0;
        while (true){
            if (resp.equals("Y")){
                System.out.print("Input the initinal deposit value>> R$");
                balance = tec.nextDouble();
                break;
            } else if (resp.equals("N")) {
                break;
            }else {
                System.out.print("Wrong answer! Just (Y/N)>> ");
                resp = tec.next().toUpperCase();
            }
        }

        Bank x = new Bank(accountNum, accountHolder, balance);
        System.out.println("Account data: ");
        x.print();

        System.out.print("Input a deposit value>> R$");
        x.setDeposit(tec.nextDouble());
        System.out.println("Account update: ");
        x.print();

        System.out.print("Input a withdraw value>> R$");
        x.setWithdraw(tec.nextDouble());
        System.out.println("Account update: ");
        x.print();
    }
}
