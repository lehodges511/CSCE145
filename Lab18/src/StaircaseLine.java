/*
Lauren Hodges
 */
public class StaircaseLine implements Line {
    //attributes
    private double width;
    private double height;

    //constructors
    public StaircaseLine(){
        //default
        this.width=0.0;
        this.height=0.0;
    }
    public StaircaseLine(double aWidth, double aHeight){
        //todo call mutators
        this.setWidth(aWidth);
        this.setHeight(aHeight);
    }

    //accessors
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    //mutators
    public void setWidth(double aWidth){
        this.width=aWidth;
    }
    public void setHeight(double aHeight){
        this.height=aHeight;
    }

    //other methods

    @Override
    public double getYPoint(double x) {
        return ((int)x/(int)width)*height;
    }
}
