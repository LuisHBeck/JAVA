import java.util.InputMismatchException;
import java.util.Scanner;

public class train2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);


        while (true){
            double speedA = 0, speedB = 0, positionA = 0, positionB = 0, time, position;
            int resp;

            do {
                try {
                    System.out.print("Input A's position (0 - 10000 Km)>> ");
                    positionA = tec.nextDouble();

                }catch (InputMismatchException e){
                    System.out.println("Invalid character. Try again");
                    positionA = tec.nextDouble();
                }
                tec.nextLine();
            }while (positionA < 0 || positionA > 10000);

            System.out.println();

            do {
                try {
                    System.out.print("Input B's position (0 - -10000 Km)>> ");
                    positionB = tec.nextDouble();

                }catch (InputMismatchException e){
                    System.out.println("Invalid character. Try again");
                }
                tec.nextLine();
            }while (positionB < 0 || positionB > 10000);

            System.out.println();

            do {
                try {
                    System.out.print("Input A's speed (0 - 300 Km/h)>> ");
                    speedA = tec.nextDouble();

                }catch (InputMismatchException e){
                    System.out.println("Invalid character. Try again");
                }
                tec.nextLine();
            }while (speedA < 0 || speedA > 300);

            System.out.println();

            do {
                try {
                    System.out.print("Input B's speed (0 - -300 Km/h)>> ");
                    speedB = tec.nextDouble();

                    break;
                }catch (InputMismatchException e){
                    System.out.println("Invalid character. Try again");
                }
            }while (speedB < 0 || speedB <= -300);

            System.out.println();

            time = (positionA - positionB) / (speedB - speedA);

            position = positionA + (speedA * time);

            System.out.printf("The train collision will happen in position %.2f and after %.2f seconds", position, time*3600);
            System.out.println();

            System.out.print("Want to continue? [0 - no / 1 - yes]>> ");
            resp = tec.nextInt();

            if (resp == 0){
                break;
            } else if (resp == 1) {
                continue;
            }else {
                System.out.println("Invalid option");
            }
            tec.nextLine();
        }
    }
}
