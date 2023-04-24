import java.util.InputMismatchException;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double speedA, speedB, positionA = -1, positionB = 1;

        while (true){
            try {
                while (positionA < 0 || positionA > 10000){
                    System.out.print("Input A's position (0-10000 Km)>> ");
                    positionA = tec.nextDouble();
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Invalid characetr. Try again");
            }
            tec.nextLine();
        }

        while (true){
            try {
                while (positionB > 0 || positionB < 10000){
                    System.out.print("Input B's position (0-10000 Km)>> ");
                    positionB = tec.nextDouble();
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Invalid characetr. Try again");
            }
            tec.nextLine();
        }



//        System.out.print("Input B's position>> ");
//        positionB = tec.nextDouble();
//        tec.nextLine();
//
//        System.out.print("Input A's speed>> ");
//        speedA = tec.nextDouble();
//        tec.nextLine();
//
//        System.out.print("Input B's speed>> ");
//        speedB = tec.nextDouble();
//        tec.nextLine();



    }
}
