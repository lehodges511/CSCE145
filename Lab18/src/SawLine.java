/*
Lauren Hodges
 */
public class SawLine implements Line {
    //attributes
    private double modValue;

    //constructors
    public SawLine(){
        //default
        this.modValue=0.0;
    }
    public SawLine(double aModValue){
        this.setModValue(aModValue);
    }

    //accessors
    public double getModValue(){
        return this.modValue;
    }

    public void setModValue(double aModValue){
        this.modValue=aModValue;
    }

    //other methods
    public double getYPoint(double x){
        return x%modValue;
    }

}
