import java.util.Random;
public class RPSComputerPlayer extends RPSPlayer{
    private Random rand;

    public RPSComputerPlayer(){//default
        super();
    }

    public void chooseGesture(){
        rand = new Random();
        int var = rand.nextInt(3);
        if(var==0){
            this.setGesture("rock");
        }
        else if(var==1){
            this.setGesture("paper");
        }
        else if(var==2){
            this.setGesture("scissors");
        }
    }


}
