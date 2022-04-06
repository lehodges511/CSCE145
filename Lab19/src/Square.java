//Lauren Hodges
public class Square {
    //attributes
    private int length;

    //constructors
    public Square(){//default
        this.length=1;
    }
    public Square(int length){
        this.length=length;
    }

    //accessors
    public int getLength(){
        return this.length;
    }


    //mutators
    public void setLength(int aLength) throws DimensionException{
        if(aLength>0){
            this.length=aLength;
        }
        else{
            throw new DimensionException();
        }
    }

    //other methods
    public void draw(){
        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public int getArea(){
        return length*length;
    }
    public int getPerimeter(){
        return length*4;
    }
}
