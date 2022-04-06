/*
Lauren Hodges
 */
public class SlopedLine implements Line {
    //attributes
    private double slope;

    //constructors
    public SlopedLine(){//default
        this.slope=0.0;
    }
    public SlopedLine(double aSlope){
        //todo call mutators
        this.setSlope(aSlope);
    }

    //accessors
    public double getSlope(){
        return slope;
    }
    //mutators
    public void setSlope(double aSlope){
        this.slope=aSlope;
    }

    //other methods
    public double getYPoint(double x){
        return slope*x;
    }


}
