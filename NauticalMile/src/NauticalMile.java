import java.util.Scanner;
public class NauticalMile {

    public static void main(String[] args) {
        System.out.println("Enter a number of Nautical Miles and I will give its breakdown in miles, yards, feet, and inches");
        Scanner keyboard = new Scanner(System.in);
        double nautMile = keyboard.nextDouble();
        double copyNautMile = nautMile;

        double origInches = nautMile*72913.4; // converts to inches
        int rInches = (int)origInches%63360; // finds remaining inches

        /*System.out.println(origInches);
        System.out.println(rInches);*/

        int miles = (int)origInches/63360; //finds max miles
        int yards = rInches/36; //finds yards
        rInches = rInches%36; //finds remaining inches from yards
        int feet = rInches/12; //finds feet
        rInches = rInches%12; //finds remaining inches
        int inches = rInches;

        System.out.println("There are "+miles+" miles, "+yards+" yards, "+feet+" feet, "+inches+" inches in "+nautMile+" Nautical Miles");



    }
}
