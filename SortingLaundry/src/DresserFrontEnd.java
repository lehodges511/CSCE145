import java.util.Scanner;
public class DresserFrontEnd {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);
        Dresser dresser= new Dresser();
        int input = 0;
        while(input!=9) {
            System.out.println("Welcome to the dresser!\nEnter 1 to add an item" +
                    "\nEnter 2 to remove an item\nEnter 3 to print out the dresser contents" +
                    "\nEnter 9 to quit");
            input = keyboard.nextInt();
            keyboard.nextLine();

            switch (input) {
                case 1: // Adds
                    System.out.println("Enter the type");
                    System.out.println("It may be undergarment, socks, stockings, top, bottom, or cape");
                    String type = keyboard.nextLine();
                    type.toLowerCase();

                    System.out.println("Enter a color");
                    System.out.println("It may be brown, pink, orange, green, blue, purple, or grey");
                    String color = keyboard.nextLine();
                    color.toLowerCase();
                    dresser.add(new Clothing(type.toString(), color.toString()));
                    break;

                case 2: // Removes
                    System.out.println("Enter the type");
                    System.out.println("It may be undergarment, socks, stockings, top, bottom, or cape");
                    type = keyboard.nextLine();
                    type.toLowerCase();

                    System.out.println("Enter a color");
                    System.out.println("It may be brown, pink, orange, green, blue, purple, or grey");
                    color = keyboard.nextLine();
                    color.toLowerCase();
                    dresser.remove(new Clothing(type.toString(), color.toString()));
                    break;

                case 3: // prints contents
                    dresser.print();
                    break;

                case 9: // Quits
                    System.out.println("Goodbye");
                    break;

            }
        }

    }
}
