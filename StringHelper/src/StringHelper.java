/*
Lauren Hodges
 */

public class StringHelper{
    private String input;
    private String input1;
    private String input2;

    //constructors
    public StringHelper()//default
    {
        this.input="none";
        this.input1="none";
        this.input2="none";
    }
    public StringHelper(String aInput, String aInput1, String aInput2){
        //TODO call mutators
    }

    //accessors
    public String getInput(){
        return this.input;
    }
    public String getInput1(){
        return this.input1;
    }
    public String getInput2(){
        return this.input2;
    }

    //mutators
    public void setInput(String aInput){
        this.input=aInput;
    }
    public void setInput1(String aInput1){
        this.input1=aInput1;
    }
    public void setInput2(String aInput2){
        this.input2=aInput2;
    }

    //other methods
    public String meshStrings(){
        return this.input+" ";

    }


        }