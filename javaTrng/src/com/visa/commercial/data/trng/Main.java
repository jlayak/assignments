package com.visa.commercial.data.trng;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        String val=sc.nextLine();
        double fTemp=Double.valueOf(val);
        double cTemp=5*(fTemp-32)/9;
        System.out.println("Temperature in Celsius:"+cTemp);

        // write your code here
    }
}