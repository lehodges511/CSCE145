/*
  Lauren Hodges
 */
import java.util.Scanner;
public class Homework00 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a 4 bit binary number");
        String first = keyboard.nextLine();

        int dOne = first.substring(0,1);
        int dTwo = first.substring(1,2);
        int dThree = first.substring(2,3);
        int dFour = first.substring(3);


        System.out.println("Enter another 4 bit binary number");
        String second = keyboard.nextLine();

        int d2One = Integer.parseInt(second.substring(0,1));
        int d2Two = Integer.parseInt(second.substring(1,2));
        int d2Three = Integer.parseInt(second.substring(2,3));
        int d2Four = Integer.parseInt(second.substring(3));

        int decimal1 = dOne*(2*2*2)+dTwo*(2*2)+dThree*(2)+dFour*1;
        int decimal2 = d2One*(2*2*2)+d2Two*(2*2)+d2Three*(2)+d2Four*1;

        int finalDec = decimal1+decimal2;
        int copyFinalDec=finalDec;

        int bin1 = copyFinalDec%2;
        copyFinalDec = copyFinalDec/2;
        int bin2 = copyFinalDec%2;
        copyFinalDec = copyFinalDec/2;
        int bin3 = copyFinalDec%2;
        copyFinalDec = copyFinalDec/2;
        int bin4 = copyFinalDec%2;


        System.out.println("The first number is "+decimal1);
        System.out.println("The second number is "+decimal2);

        System.out.println("Added together is "+finalDec);
        System.out.println("Which is "+bin1+bin2+bin3+bin4+" in binary.");

    }
}
