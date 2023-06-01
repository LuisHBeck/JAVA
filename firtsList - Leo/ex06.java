package Bosch;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        System.out.print("Input number a: ");
        a = tec.nextDouble();
        System.out.print("Input number b: ");
        b = tec.nextDouble();
        System.out.print("Input number c: ");
        c = tec.nextDouble();

        delta = Math.pow(b, 2) - (4 * a * c);
        x1 = (-b + (Math.sqrt(delta))) / 2*a;
        x2 = (-b - (Math.sqrt(delta))) / 2*a;

        System.out.printf("Delta = %.1f", delta);
        System.out.println();
        System.out.printf("X' = %.1f", x1);
        System.out.println();
        System.out.printf("X'' = %.1f", x2);

    }
}
