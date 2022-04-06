/*
Lauren Hodges
 */

import java.util.Scanner;
import java.util.Random;
public class Homework02 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        boolean repeat = true;

        System.out.println("Let's play rock, paper, scissors! Best 2 out of 3");
        while(repeat) {
            int cCount = 0;
            int pCount = 0;
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter \"rock\" \"paper\" or \"scissors\"");
                String play = keyboard.nextLine();

                int var = r.nextInt(3);
                String comp;

                if ((play.equals("rock")) || (play.equals("paper")) || (play.equals("scissors"))) {
                    if (var == 0) {
                        comp = "rock";
                    } else if (var == 1) {
                        comp = "paper";
                    } else {
                        comp = "scissors";
                    }
                    System.out.println(play + " v " + comp);
                    if (comp.equals(play)) {
                        System.out.print("Tie!");
                    } else if ((comp.equals("rock")) && (play.equals("paper"))) {
                        System.out.print("Player Wins!");
                        pCount++;
                    } else if ((comp.equals("rock")) && (play.equals("scissors"))) {
                        System.out.print("Computer wins!");
                        cCount++;
                    } else if ((comp.equals("paper")) && (play.equals("rock"))) {
                        System.out.print("Computer wins!");
                        cCount++;
                    } else if ((comp.equals("paper")) && (play.equals("scissors"))) {
                        System.out.print("Player wins!");
                        pCount++;
                    } else if ((comp.equals("scissors")) && (play.equals("rock"))) {
                        System.out.print("Player wins!");
                        pCount++;
                    } else if ((comp.equals("scissors")) && (play.equals("paper"))) {
                        System.out.print("Computer wins!");
                        cCount++;
                    }

                } else {
                    System.out.println("Not a valid input! Computer wins");
                    cCount++;
                }
                System.out.println("\nPlayer has won " + pCount + " times and the computer has won " + cCount + " times");
            }
            if (pCount > cCount) {
                System.out.println("The player wins!");
            } else if (cCount > pCount) {
                System.out.println("The computer wins!");
            }
            else if (cCount==pCount)
            {
                System.out.println("It's a tie!");
            }
            System.out.println("Play again? \"yes\" or \"no\"");
            String again = keyboard.nextLine();
            if(again.equals("yes"))
            {
                repeat = true;
            }
            else
            {
                repeat = false;
            }

        }
        System.out.println("Goodbye!");
    }
}
