/*
Lauren Hodges
 */
public class Movie {
    //attributes
    private String name;
    private int year;
    private int rate;
    private String director;
    private double boxOffice;

    //constructors
    public Movie(){//default
        this.name=null;
        this.year=0;
        this.rate=0;
        this.director=null;
        this.boxOffice=0;
    }
    public Movie(String aName, int aYear, int aRate, String aDirect, double aBox){
        //todo call mutators
        this.setName(aName);
        this.setYear(aYear);
        this.setRate(aRate);
        this.setDirector(aDirect);
        this.setBoxOffice(aBox);
    }

    //accessors
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public int getRate(){
        return this.rate;
    }
    public String getDirector(){
        return this.director;
    }
    public double getBoxOffice(){
        return this.boxOffice;
    }

    //mutators
    public void setName(String aName){
        this.name=aName;
    }
    public void setYear(int aYear){
        if(aYear>0&&aYear<=2019){
            this.year=aYear;
        }
        else{
            System.out.println("Invalid Year");
        }
    }
    public void setRate(int aRate){
        if(aRate>=1&&aRate<=5){
            this.rate=aRate;
        }
        else{
            System.out.println("Invalid rating");
        }
    }
    public void setDirector(String aDirect){
        this.director=aDirect;
    }
    public void setBoxOffice(double aBox){
        if(aBox>0.0) {
            this.boxOffice = aBox;
        }
    }

    public String toString(){
        return "Name: "+name+"Year: "+year+"Rate: "+rate+"Director: "+
                director+"Box Office Gross: "+boxOffice;
    }
}
