import java.util.Scanner;

/**
 * This is a simple Java program that asks user for two 
 * inputs. The number of miles and number of gallons used.
 * It calculates the mileage for the trip and will return
 * the gas mileage achieved.
 */
public class Mileage {
    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double miles, gallons, mileage;
      
        System.out.println ("This program calculates mileage");
        System.out.println ("How many miles were driven?");
        miles = keyboard.nextDouble();
        System.out.println ("How many gallons of gas was used?");
        gallons = keyboard.nextDouble();
      
        mileage = miles / gallons;
        System.out.println ("You achieved " + mileage + " MPG");
    }
}
