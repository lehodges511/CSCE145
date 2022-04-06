/*
Lauren Hodges
 */

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int [][] table = new int[10][10];
        for (int row=0; row<10; row++) {
            for (int column = 0; column < 10; column++) {
                int value = r.nextInt(10);
                table[row][column] = value;
                System.out.print(value);

            }
            System.out.println("");
        }


    }
}
