package com.visa.commercial.data.trng;

/**
 * Created by jlayak on 7/8/2016.
 */
import java.util.Scanner;
public class zeullersCongruence {

    static int day;
    static int month;
    static int year;

    zeullersCongruence(int d,int m,int y)
    {
        day=d;
        month=m;
        year=y;

    }

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);

        String inpVal="";
        int i=0;
        int dayOfYear=0;

        while(true)
        {
            i++;
            System.out.println("Enter the day month and year");
            inpVal=sc.nextLine();
            if (inpVal.equalsIgnoreCase("QUIT")) break;
            if(i%3==1)
            {
                day=Integer.valueOf(inpVal);
            }
            if(i%3==2)
            {
                if(inpVal.equals("1") || inpVal.equals("2"))
                    month=Integer.valueOf(inpVal)+12;
                else
                    month=Integer.valueOf(inpVal);
                System.out.println("month"+month);

            }
            if(i%3==0)
            {
                if (month==13 || month==14)
                    year=Integer.valueOf(inpVal)-1;
                else
                    year=Integer.valueOf(inpVal);

                dayOfYear=((13*(month+1))/5 + (year/4) + ((6*year)/100)+ year/400 )%7;
                System.out.println("Dayofyear="+dayOfYear);
            }
        }
    }

}
