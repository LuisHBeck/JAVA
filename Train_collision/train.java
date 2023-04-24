import java.util.InputMismatchException;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double speedA = -1, speedB = 1, positionA = -1, positionB = 1;

        while (true){
            try {
                while (positionA < 0 || positionA > 10000){
                    System.out.print("Input A's position (0 - 10000 Km)>> ");
                    positionA = tec.nextDouble();
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Invalid character. Try again");
            }
            tec.nextLine();
        }

        System.out.println();

        while (true){
            try {
                while (positionB > 0 || positionB < -10000){
                    System.out.print("Input B's position (0 - -10000 Km)>> ");
                    positionB = tec.nextDouble();
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Invalid character. Try again");
            }
            tec.nextLine();
        }

        System.out.println();

        while (true){
            try {
                while (speedA < 0 || speedA > 300){
                    System.out.print("Input A's speed (0 - 300 Km/h)>> ");
                    speedA = tec.nextDouble();
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Invalid character. Try again");
            }
            tec.nextLine();
        }

        System.out.println();

        while (true){
            try {
                while (speedB > 0 || speedB < -300){
                    System.out.print("Input A's speed (0 - 300 Km/h)>> ");
                    speedB = tec.nextDouble();
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Invalid character. Try again");
            }
            tec.nextLine();
        }
    }
}
