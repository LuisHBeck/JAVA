package Bosch;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        double base, height, area;

        System.out.print("Input the triangle base: ");
        base = tec.nextDouble();
        System.out.print("Input the triangle height: ");
        height = tec.nextDouble();

        area = ((base*height) / 2);

        System.out.printf("The area of your triangle = %.2f", area);
    }
}
