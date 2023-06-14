package CPF;

import java.util.Scanner;

public class CPF_checker {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int sumCountOne = 10, sumCountTwo = 11;
        int countDigitOne = 0, countDigitTwo = 0;
        int digitOne, digitTwo;
        int[] cpf = new int[11];
        String cpfString;

        System.out.print("Input your CPF>> ");
        cpfString = tec.nextLine();

        cpfString = cpfString.replace(".", "");
        cpfString = cpfString.replace("-", "");

        for (int i=0; i<cpfString.length(); i++) {
            cpf[i] = Character.getNumericValue(cpfString.charAt(i));
        }
        
        // for (int i=0; i < 9; i++) {
        //     cpf[i] = tec.nextInt();
        //     tec.nextLine();
        // }

        // CHECK DIGITO 1
        for (int i=0; i < 9; i++) {
            countDigitOne += cpf[i] * sumCountOne;
            sumCountOne--;
        }

        digitOne = 11 - (countDigitOne%11);

        if (digitOne > 9){
            digitOne = 0;
        }

        cpf[9] = digitOne;

        // CHECK DIGITO 2
        for (int i=0; i < 10; i++) {
            countDigitTwo += cpf[i] * sumCountTwo;
            sumCountTwo--;
        }

        digitTwo = 11 - (countDigitTwo%11);

        if (digitTwo > 9){
            digitTwo = 0;
        }

        cpf[10] = digitTwo;

        int counter = 0;

        for (int digit : cpf) {
            counter++;
            if (counter == 4 || counter == 7) {
                System.out.print('.');
            }else if (counter == 10){
                System.out.print('-');
            }
            System.out.print(digit);
        }
    }
}
