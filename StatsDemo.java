/****************************************************************
/    This program is for taking the contents of a file          /
/    and calculating the mean and standard deviation,           /
/    Then returning the answer in a new file Results.txt        /
/                    @ Matt Kline                               /
/                    @ October 9, 2014                          /
/                    @ Version 1                                /
/***************************************************************/

import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

public class StatsDemo {
	public static void main(String [] args) throws IOException {
		double sum = 0;
		double number = 0;
        int count = 0;
		double mean = 0;
		double stdDev = 0;
		double difference;
		String filename;

		DecimalFormat threeDecimals = new DecimalFormat("0.000");
        Scanner keyboard = new Scanner (System.in);

		System.out.println("This program calculates statistics on a file containing a series of numbers");
		System.out.print("Enter the file name:  ");
		filename = keyboard.nextLine();

		File input = new File(filename);
        Scanner inputfile = new Scanner (input);
		
        while (inputfile.hasNextLine()) {
            number = inputfile.nextDouble();
            sum = number + sum;
            ++count;
        }
			
		inputfile.close();
		mean = sum / count;

        File secondinput = new File(filename);
        Scanner secondinputfile = new Scanner (secondinput);
		
		sum = 0;
		count = 0;
		
        while (secondinputfile.hasNextLine()) {
	        number = secondinputfile.nextDouble();
			difference = number - mean;
		    sum = ((Math.pow(difference, 2)) + sum);
			++count;
        }
           
		inputfile.close();
		stdDev = Math.sqrt((sum/count));

		FileWriter fw = new FileWriter ("Results.txt", true);
        PrintWriter pw = new PrintWriter (fw);
		pw.println ("The mean is " + threeDecimals.format(mean));
		pw.println ("The standard deviation is " + threeDecimals.format(stdDev));
        pw.flush();
        pw.close();
	}
}