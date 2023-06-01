package Bosch;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Input a Fahrenheit temperature: ");
        double fahrenheit = tec.nextDouble();

        double celsius = ((fahrenheit - 32) / 1.8);

        System.out.printf("%.2fF = %.2f°C", fahrenheit, celsius);
    }
}
