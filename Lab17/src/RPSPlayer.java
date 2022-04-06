public class RPSPlayer implements RPSPlayerInterface {
    String gesture;
    private int points;

    public RPSPlayer(){ //default
        this.gesture="none";
        this.points=0;
    }

    public String getGesture(){
        return this.gesture;
    }
    public int getPoints(){
        return this.points;
    }

    public void setGesture(String aGesture){
        this.gesture=aGesture;
    }
    public void setPoints(int aPoints){
        this.points=aPoints;
    }

    public void chooseGesture(){
        this.gesture="none";
    }
}
