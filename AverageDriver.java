/************************************************************
/     This program is the driver for the average class      /
/              @ Matt Kline                                 /
/              @ November 19, 2014                          /
/                                                           /
/***********************************************************/

import java.util.Scanner;

public class AverageDriver {
   public static void main (String[] args) {
   String stringResult = null;
   double meanResult = 0;
   int value1, value2, value3, value4, value5;
   
   Scanner keyboard = new Scanner(System.in);
      
   System.out.println ("Please enter 5 values");
   System.out.print ("Value 1: ");
   value1 = keyboard.nextInt();
   System.out.print ("Value 2: ");
   value2 = keyboard.nextInt();
   System.out.print ("Value 3: ");
   value3 = keyboard.nextInt();
   System.out.print ("Value 4: ");
   value4 = keyboard.nextInt();
   System.out.print ("Value 5: ");
   value5 = keyboard.nextInt();
   System.out.println ("");
   
   Average average = new Average(value1, value2, value3, value4, value5);
   
   average.selectionSort();
   
   stringResult = average.toString();
   System.out.println ("The values entered were " + stringResult);
   
   meanResult = average.calculateMean();
   System.out.println ("The mean is " + meanResult);
   }
}  