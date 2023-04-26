import java.util.InputMismatchException;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        while (true){
            Scanner tec = new Scanner(System.in);

            double speedA = -1, speedB = 1, positionA = -1, positionB = -1, time, position;

            try {
                while (positionA < 0 || positionA > 10000){
                    System.out.print("Input A's position (0 - 10000 Km)>> ");
                    positionA = tec.nextDouble();
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid character. Try again");
            }
            tec.nextLine();

            System.out.println();

            try {
                while (positionB < 0 || positionB > 10000){
                    System.out.print("Input B's position (0 - -10000 Km)>> ");
                    positionB = tec.nextDouble();
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid character. Try again");
            }
            tec.nextLine();

            System.out.println();

            try {
                while (speedA < 0 || speedA > 300){
                    System.out.print("Input A's speed (0 - 300 Km/h)>> ");
                    speedA = tec.nextDouble();
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid character. Try again");
            }
            tec.nextLine();

            System.out.println();

            try {
                while (speedB > 0 || speedB < -300){
                    System.out.print("Input B's speed (0 - 300 Km/h)>> ");
                    speedB = tec.nextDouble();
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Invalid character. Try again");
            }
            tec.nextLine();

                time = (positionA - positionB) / (speedB - speedA);

                position = positionA + (speedA * time);

                System.out.printf("The train collision will happen in position %.2f and after %.2f seconds", position, time*3600);
                System.out.println();

                System.out.print("Want to continue? [0 - no / 1 - yes]>> ");
                int resp = tec.nextInt();
                if (resp == 0){
                    break;
                } else if (resp == 1) {
                    continue;
                }else {
                    System.out.println("Invalid option! Try again.");
                }
                tec.nextLine();
        }
    }
}