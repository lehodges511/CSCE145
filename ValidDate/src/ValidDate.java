/*
Lauren Hodges
 */

import java.util.Scanner;
public class ValidDate {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a date in the format month/day");
        String date = keyboard.nextLine();

        System.out.println(date.substring(2,8));
       /* String dateCopy = date;
        int workingIndex = dateCopy.indexOf("/"); //finds / in string
        String sMonth = dateCopy.substring(0, workingIndex); // separates the month
        int iMonth = Integer.parseInt(sMonth); //converts month to integer
        dateCopy = dateCopy.substring(workingIndex+1); // goes to index after /

        String sDay = dateCopy.substring(0, workingIndex);
        int iDay = Integer.parseInt(sDay); //converts day to integer

        if((iMonth==1)||(iMonth == 3) || (iMonth ==5)||(iMonth==7)||(iMonth==8)||(iMonth==10)||(iMonth==12))
        {
            if ((iDay<=31)&&(iDay>0))
            {
                System.out.println(date+" is a valid date!");
            }

            else
            {
                System.out.println(date+" is NOT a valid date!");
            }
        }

        else if ((iMonth==4)||(iMonth==6)||(iMonth==9)||(iMonth==11))
        {
            if ((iDay<=30)&&(iDay>0))
            {
                System.out.println(date+" is a valid date!");
            }

            else
            {
                System.out.println(date+" is NOT a valid date!");
            }
        }

       else if (iMonth==2)
        {
            if ((iDay<=29)&&(iDay>0))
            {
                System.out.println(date+" is a valid date!");
            }

            else
            {
                System.out.println(date+" is NOT a valid date!");
            }
        }

       else
        {
            System.out.println(date+" is NOT a valid date!");
        }

*/


    }
}
