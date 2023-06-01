package Bosch;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        double height, weight, imc;

        System.out.print("Input yout height: ");
        height = tec.nextDouble();
        System.out.print("Input your weight: ");
        weight = tec.nextDouble();

        imc = weight / (height * height);

        System.out.printf("Your IMC = %.2f", imc);
    }
}
