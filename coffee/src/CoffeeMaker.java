import java.util.Scanner;

public class CoffeeMaker {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Let's Coffee!!!!");
        System.out.println("\nWhats the name of the first coffee?");
        String name1 = keyboard.nextLine();
        System.out.println("What's the caffeine content?");
        double caff1 = keyboard.nextDouble();
        keyboard.nextLine();

        Coffee coffee1 = new Coffee(name1, caff1);

        System.out.println("What's the name of the second coffee?");
        String name2 = keyboard.nextLine();
        System.out.println("What's the caffeine content?");
        double caff2 = keyboard.nextDouble();

        Coffee coffee2 = new Coffee(name2, caff2);

        System.out.println(coffee1.toString());
        System.out.println(coffee2.toString());




    }
}
