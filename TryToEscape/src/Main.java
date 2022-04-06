import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You wake to find yourself on the floor of a dark, cold room. Suddenly you remember... You were kidnapped!\n" +
                "Do you stay in the room, or try to escape? Enter \"stay\" or \"escape\"");
        String ans1 = keyboard.nextLine();
        if (ans1.equals("stay")) {
            System.out.println("You decide to stay put. You look around the room. It seems to be empty. You get up and walk around, seeing if there's\n" +
                    "anything you missed. You notice a small button by the door. Do you push it, or not? Enter \"push\" or \"don't push\"");
            String button = keyboard.nextLine();
            if (button.equalsIgnoreCase("push"))
            {
                System.out.println("You press the button. Instant death. ");
            }
        }
    }
}
