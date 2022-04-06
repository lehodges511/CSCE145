public class Vehicle {
    //attributes
    private String manu;
    private int cylinders;
    private String owner;

    //constructors

    public Vehicle(){ //default
        this.manu = "";
        this.cylinders = 0;
        this.owner = "";
    }
    public Vehicle(String aManu, int aCylinders, String aOwner){
        //TODO call mutators
        this.setManu(aManu);
        this.setCylinders(aCylinders);
        this.setOwner(aOwner);

    }

    //accessors
    public String getManu(){
        return this.manu;
    }
    public int getCylinders(){
        return this.cylinders;
    }
    public String getOwner(){
        return this.owner;
    }

    //mutators
    public void setManu(String aManu){
        this.manu=aManu;
    }
    public void setCylinders(int aCylinders){
        if(aCylinders>0){
            this.cylinders=aCylinders;
        }
    }
    public void setOwner(String aOwner){
        this.owner=aOwner;
    }

    //other methods
    public boolean equals(Vehicle aVehicle){
        return aVehicle!=null&&this.manu.equals(aVehicle.getManu())
                &&this.cylinders==aVehicle.getCylinders()&&
                this.owner.equals(aVehicle.getOwner());
    }
    public String toString(){
        return this.manu+" "+this.cylinders+" "+this.owner;
    }

}
