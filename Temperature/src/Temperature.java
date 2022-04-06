/*
Lauren Hodges
 */

import java.util.Scanner;
import java.util.Random;

public class Temperature {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Welcome to the above average temperature tester program.");

        double[] temp = new double[10];
        for (int i=0; i<temp.length;i++)
        {
            System.out.println("Please enter the temperature for day "+(i+1));
            temp[i] = keyboard.nextDouble();
        }

        double avg = (temp[0]+temp[1]+temp[2]+temp[3]+temp[4]+temp[5]+temp[6]+temp[7]+temp[8]+temp[9])/10;

        System.out.println("The average temperature was "+avg);
        System.out.println("The days that were above average were");

        for(int i=0; i<temp.length;i++)
        {
            if(temp[i]<avg)
            {
                System.out.println("Day "+(i+1)+" with "+temp[i]);
            }
        }
        System.out.println("DONE!");
    }
}
