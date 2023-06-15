package Prime;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        int inputNumber, option;
        boolean result;

        Scanner tec = new Scanner(System.in);


        while (true){
            do {
            System.out.println("Input -1 to stop");
            System.out.println("");
            System.out.print("Input a number (0 - 10000)>> ");
            inputNumber = tec.nextInt();
            tec.nextLine();
            System.out.println("");

            if (inputNumber > 10000){
                System.out.println("Invalid number. Try again!");
            }

            }while (inputNumber < -1 || inputNumber > 10000);

            if (inputNumber == -1){
                System.out.println("Thanks!!");
                break;
            }

            result = primeVerify(inputNumber);

            if (result == true){
                System.out.println("It's a prime number");
            }else {
                System.out.println("It's not a prime number");
            }
            System.out.println(result);

            do {
                System.out.print("[1] - Inserir / [2] - Remover>> ");
                option = tec.nextInt();
                tec.nextLine();
            }while (option < 1 || option > 2);

            numberList(inputNumber, result, option);
        }
    }

    public static boolean primeVerify(int inputNumber) {
        int[] primeBase = {2,3,5,11};
        int[] results = new int[4];
        int verify, count=0, repetitions=0;

        for (int num: primeBase){
            if (inputNumber%2 == 0 && inputNumber!=2){
                return false;
            }else if (inputNumber%3 == 0 && inputNumber!=3){
                return false;
            }else if (inputNumber%5 == 0 && inputNumber!=5){
                return false;
            }else if (inputNumber%7 == 0 && inputNumber!=7){
                return false;
            }else if (inputNumber%11 == 0 && inputNumber!=11){
                return false;
            }

            verify = inputNumber%num;
            results[count] = verify;
            count++;
        }

        for (int num: results){
            if (num == 0){
                repetitions++;
            }
        }
        
        if (repetitions > 1) {
            return false;
        }else {
            return true;
        }
    }

    public static void numberList(int number, boolean value, int option) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        if (option == 1){
            for (int k = number; k > 1; k--){
                boolean verify = primeVerify(k);
                if (verify == true) {
                    primeNumbers.add(k);
                }
            }
            primeNumbers.sort(null);
            System.out.println(primeNumbers.toString());
            primeNumbers.clear();
        }

        if (option == 2){
            for (int k = number; k > 1; k--){
                boolean verify = primeVerify(k);
                if (verify == false) {
                    primeNumbers.add(k);
                }
            }
            primeNumbers.add(1);
            primeNumbers.sort(null);
            System.out.println(primeNumbers.toString());
            primeNumbers.clear();
        }
    }
}
