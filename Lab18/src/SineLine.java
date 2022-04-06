/*
Lauren Hodges
 */
public class SineLine implements Line{
    //variables
    private double amp;
    private double freq;

    //constructors
    public SineLine(){
        this.amp=0.0;
        this.freq=0.0;
    }
    public SineLine(double aAmp, double aFreq){
        //todo call mutators
        this.setAmp(aAmp);
        this.setFreq(aFreq);
    }

    //accessors
    public double getAmp(){
        return this.amp;
    }
    public double getFreq(){
        return this.freq;
    }

    //mutators
    public void setAmp(double aAmp){
        this.amp=aAmp;
    }
    public void setFreq(double aFreq){
        this.freq=aFreq;
    }

    //other methods
    public double getYPoint(double x){
        return amp*Math.sin(x*freq);
    }
}
