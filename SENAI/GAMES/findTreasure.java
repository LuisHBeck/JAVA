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

        String matriz[][] = new String[5][5];

        for (int i1 = 0; i1 < matriz.length; i1++){
            for (int j1 = 0; j1 < matriz.length; j1++){
                matriz[i1][j1] = "_";
                matriz[i][j] = "$";
                System.out.print(matriz[i1][j1]);
            }
            System.out.println();
        }
    }
}
