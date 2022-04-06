import java.util.Scanner;

public class RPSHumanPlayer extends RPSPlayer {
    private Scanner keyboard;

    public RPSHumanPlayer(){//default
        super();
        keyboard=new Scanner(System.in);
    }

    public void chooseGesture(){
        this.gesture=keyboard.nextLine();
    }

}
