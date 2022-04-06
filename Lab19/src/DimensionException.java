public class DimensionException extends Exception{
    //constructor
    public DimensionException() {
        //default
        super("Dimension cannot be less than 1.");
    }
    public DimensionException(String message){
        super(message);
    }
}
