/*
Lauren Hodges
 */

import java.util.Scanner;

public class Apple {
    //Instance variables
    private String type;
    private Double weight;
    private Double price;

    public void run(){
        boolean run = true;
        while(run){
            System.out.println("Welcome to the apple tester\n");
            System.out.println("Creating a default apple");
            System.out.println("Printing the default apple's values");

        }
    }

    public Apple()// default
    {
        this.type="none";
        this.weight=0.0;
        this.price=0.0;
    }
    public Apple(String aType, double aWeight, double aPrice)
    {
        //TODO call mutators
        this.setType(aType);
        this.setWeight(aWeight);
        this.setPrice(aPrice);
    }
    //Accessors

    public String getType()
    {
        return this.type;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public double getPrice()
    {
        return this.price;
    }

    //mutators
    public void setType(String aType)
    {
        this.type=aType;
    }
    public void setWeight(double aWeight)
    {
        if((aWeight>0.0)&&(aWeight<=2.0))
        {
            this.weight = aWeight;
        }
        else
        {
            this.weight = 0.0;
        }
    }
    public void setPrice(double aPrice)
    {
        if(price>0.0){
            this.price = aPrice;
        }
        else
        {
            this.price = 0.0;
        }
    }
    //other methods
    public String toString()
    {
        return "Name: "+this.type+"  Weight:  "+this.weight+"  Price:  "+this.price;
    }
    public boolean equals (Apple aApple)
    {
        return aApple!=null && this.type.equals(aApple.getType())
                && this.weight==aApple.getWeight() && this.price==aApple.getPrice();
    }



}

public class AppleTester{
    public static void Main(String[] args)
    {
        System.out.println("Welcome to the apple tester\n");
        System.out.println("Creating a default apple");
        System.out.println("Printing the default apple's values");
        Apple apple = new Apple();
        apple.();

    }
}