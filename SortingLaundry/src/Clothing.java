enum Clothing_Type{undergarment, socks, stockings, top, bottom, cape}
enum Clothing_Color{brown, red, pink, orange, green, blue, purple, grey}

public class Clothing {
    //variables
    private Clothing_Type type;
    private Clothing_Color color;

    //constructors
    public Clothing(){//default
        this.type=null;
        this.color=null;
    }

    public Clothing(String aType, String aColor){
        //TODO call mutators
        this.setColor(aColor);
        this.setType(aType);
    }

    //accessors
    public Clothing_Type getType(){
        return this.type;
    }
    public Clothing_Color getColor(){
        return this.color;
    }

    //mutators

    public void setType(String aType){
            this.type = Clothing_Type.valueOf(aType);
    }

    public void setColor(String aColor){
        this.color=Clothing_Color.valueOf(aColor);

    }

    public String toString(){
        return type+" "+color;
    }
    public boolean equals(Clothing aClothing){
        return aClothing!=null&&(this.type.equals(aClothing.getType())&&
                this.color.equals(aClothing.getColor()));
    }

}


