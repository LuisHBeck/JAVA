package Bosch;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Input a Celsius temperature: ");
        double celsius = tec.nextDouble();

        double fahrenheit = ((celsius * 1.8) + 32);

        System.out.printf("%.2f°C = %.2fF", celsius, fahrenheit);
    }
}
