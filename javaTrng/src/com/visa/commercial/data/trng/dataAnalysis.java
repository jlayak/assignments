package com.visa.commercial.data.trng;

import java.util.Scanner;

/**
 * Created by jlayak on 7/10/2016.
 */
public class dataAnalysis {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements in array");
        int inpVal=Integer.valueOf(sc.nextLine());
        int[] elemArray=new int[inpVal];
        for(int i=0;i<inpVal;i++) {
            System.out.println("Enter the"+i+"th element");
            elemArray[i]=Integer.valueOf(sc.nextLine());
        }
        int smallest=elemArray[0];
        int largest =elemArray[0];
        double sum=0.0;
        for (int i=0;i<inpVal;i++)
        {
            if(elemArray[i]<=smallest) smallest=elemArray[i];else smallest=smallest;
            if(elemArray[i]>=largest) largest=elemArray[i];else largest=largest;
            sum=sum+elemArray[i];
        }
        System.out.println("Smallest number in array :"+smallest);
                System.out.println("Largest number in array :"+largest);
                        System.out.println("Mean of array :"+sum/elemArray.length);

    }
}
