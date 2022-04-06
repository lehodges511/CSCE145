/*
Lauren Hodges
 */

import java.util.Scanner;

public class NumbersSquared {

    public static void main(String[] args) {
        System.out.println("Hi! What's your name?");
        Scanner keyboard = new Scanner(System.in);
        String answer1 = keyboard.nextLine();

        System.out.println("Hi, "+answer1+"! How are you?");
        String answer2 = keyboard.nextLine();
        if (answer2.equalsIgnoreCase("good")){
            System.out.println("That's good!");}

        if (answer2.equalsIgnoreCase("tired")){
            System.out.println("Big oof");}

        else{
            System.out.println("I'm not too bad myself.");}

        System.out.println("Hey, do me a favor and tell Thomas that the computer is telling him to go to bed.");
        System.out.println("Did you do it?");
        String answer3 = keyboard.nextLine();

        if (answer3.equalsIgnoreCase("yes"))
            System.out.println("Haha thanks :)");

        if (answer3.equalsIgnoreCase("yes")){
            System.out.println("Did he get mad?");
            String mad = keyboard.nextLine();
            if (mad.equalsIgnoreCase("yes"))
                System.out.println("Oops. Sorry.");
            if (mad.equalsIgnoreCase("no"))
                System.out.println("Heyyyyy that's good.");}

        if (answer3.equalsIgnoreCase("no"))
            System.out.println("That's ok. He'd probably get mad and we wouldn't want that.");

        System.out.println("Well, I think it's time for me to leave.");
        System.out.println("Goodbye!");
        String bye = keyboard.nextLine();

        String wow = keyboard.nextLine();
        System.out.println("You're still here?");
        String answer4 = keyboard.nextLine();
        System.out.println("Don't you have anything better to do?");
        String answer5 = keyboard.nextLine();
        System.out.println("I have stuff to get done. Bye "+answer1+"!");
        String answer6 = keyboard.nextLine();
        String answer7 = keyboard.nextLine();
        System.out.println("Come on man. I'm going to have to stop letting you talk to me if you don't stop. Now bye.");
        String answer8 = keyboard.nextLine();
        String answer9 = keyboard.nextLine();
        System.out.println("Ok, that's it. It was nice talking to you. See ya.");



    }
}
