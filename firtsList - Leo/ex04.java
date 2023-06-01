package Bosch;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int n;
        double x, y;

        System.out.print("Input a number: ");
        n = tec.nextInt();

        x = Math.pow(n, 2);
        y = Math.pow(n, 3);

        System.out.printf("%d^2 = %.0f", n, x);
        System.out.println();
        System.out.printf("%d^3 = %.0f", n, y);

    }
}
