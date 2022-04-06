/*
Lauren Hodges
 */
import java.util.Scanner;

public class Coffee{
        //Instance variables
        private String name;
        private double caff;
        private double maxCups;

        //constructors
        public Coffee(String aName, double aCaff)
        {
                //TODO call mutators
                this.setName(aName);
                this.setCaff(aCaff);
                this.setMaxCups(riskyAmount());
        }

        //accessors
        public String getName(){
                return this.name;
        }
        public double getCaff(){
                return this.caff;
        }
        public double getMaxCups(){
                return this.maxCups;
        }

        //mutators
        public void setName(String aName){
                this.name=aName;
        }
        public void setCaff(double aCaff){
                if(aCaff<=300&&aCaff>=50)
                {
                        this.caff=aCaff;
                }
                else{
                        System.out.println("Invalid input, goodbye");
                        System.exit(1);
                }
        }
        public void setMaxCups(double aMaxCups)
        {
                maxCups=(180/((caff/100.0)*6.0));
                this.maxCups=aMaxCups;
        }

        //other methods
        public double riskyAmount(){
                if(caff>=50&&caff<=300) {
                        maxCups = (180 / ((caff / 100.0) * 6.0));
                }
                else{
                        maxCups=0;
                }
                return maxCups;
        }
        public String toString(){
                return "It would take "+maxCups+" "+name+" coffees before it's dangerous to drink more.";
        }



}
