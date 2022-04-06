/*
Lauren Hodges
 */

import java.util.Scanner;
public class Homework03 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome! Enter taco names and prices and I'll sort them for you!");

        String [] names = new String[10]; //array for names
        double [] prices = new double[10]; //array for prices

        for(int i=0; i<10; i++) //allows 10 inputs
        {
            System.out.println("Enter name of taco "+(i+1));
            String name = keyboard.nextLine();
            System.out.println("Enter the taco's price.");
            double price = keyboard.nextDouble();
            keyboard.nextLine();
            prices[i]=price; //stores price in array
            names[i]=name; //stores name in array

        }
        System.out.println("\nSorted tacos are:");
        for(int i=0;i<names.length;i++) //Selection sort
        {
            int min = i;
            for(int j=i+1; j<names.length;j++)
            {
                if(prices[j]<prices[min]) //if price at index j is less than price at index min, or i
                {
                    double temp=prices[j]; //swap price elements
                    prices[j]=prices[min];
                    prices[min]=temp;

                    String temp1=names[j]; //swap name elements
                    names[j]=names[min];
                    names[min]=temp1;
                }
            }
            System.out.println(names[i]+" "+prices[i]); //output sorted array
        }
    }
}
