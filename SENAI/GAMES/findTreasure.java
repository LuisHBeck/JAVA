package game_treasure;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class treasure {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Random generator = new Random();
        int i, j;
        i = generator.nextInt(4);
        j = generator.nextInt(4);
        System.out.println(i);
        System.out.println(j);

        String matriz[][] = new String[5][5];

        System.out.println("————————FIND THE TREASURE————————");

        for (int line = 0; line < matriz.length; line++){
            for (int rool = 0; rool < matriz.length; rool++){
                matriz[line][rool] = " _ ";
                System.out.print(matriz[line][rool]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Input the line>> ");
        int input_line = tec.nextInt();
        System.out.print("Input the rool>> ");
        int input_rool = tec.nextInt();
        System.out.println();

        if (input_line == i){
            if (input_rool == j){
                System.out.println("CONGRATS!! YOU WIN");
                for (int i1 = 0; i1 < matriz.length; i1++){
                    for (int j1 = 0; j1 < matriz.length; j1++){
                        matriz[i1][j1] = " _ ";
                        matriz[i][j] = " $ ";
                System.out.print(matriz[i1][j1]);
                    }
            System.out.println();
                }
            }
        }
    }
}

