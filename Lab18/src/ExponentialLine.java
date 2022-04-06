/*
Lauren Hodges
 */
public class ExponentialLine implements Line {
    //variables
    private double exponent;

    //constructors
    public ExponentialLine(){ //default
        this.exponent=0.0;
    }
    public ExponentialLine(double aExponent){
        //todo call mutators
        this.setExponent(aExponent);

    }

    //accessors
    public double getExponent(){
        return exponent;
    }
    //mutators
    public void setExponent(double aExponent){
        this.exponent=aExponent;
    }

    //other methods
    public double getYPoint(double x){
        return Math.pow(x,exponent);
    }
}
