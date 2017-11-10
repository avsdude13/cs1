import java.util.Scanner;

/**
 * This is a simple Java program that will complete 4 simple tasks.
 * The first task will calculate the average of 2 numbers.
 * The second task will convert from F to C
 * The third task will make manipulations of a name
 * The fourth will calculate the volume of a sphere
 */
public class NumericTypes {
    public static void main (String [] args) {

    	Scanner keyboard = new Scanner(System.in);

    	// Variables for Average
        final int NUMBER = 2;
        final int SCORE1 = 100;
        final int SCORE2 = 95;

        // Variables for Temperature
        final int BOILING_IN_F = 212;
        double fToC, average;
        String output;

        // Variables for Name
        String firstName, lastName, fullname;
        char firstInitial;
        int characters;

        // Variables for Volume
        double radius, diameter, volume;

        // Average of 2 scores
        average = (SCORE1 + SCORE2) / NUMBER;
        output = SCORE1 + " and " + SCORE2 + " have an average of " + average;
        System.out.println(output);

		// Convert Fahrenheit temperatures to Celsius
        fToC = 5.0/9 * (BOILING_IN_F - 32);
        output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
        System.out.println(output);
        System.out.println();

        // Combine first and last name
        System.out.println ("Enter your first name");
        firstName = keyboard.nextLine();
        System.out.println ("Enter your last name");
        lastName = keyboard.nextLine();
        fullName = firstName + " " + lastName;
        System.out.print ("Your name is " + fullName);
		System.out.println("");

		// Find the first initial, convert full name to capitals, count characters
        firstInitial = firstName.charAt(0);
        System.out.println ("Your first Initial is " + firstInitial);
        fullName = fullName.toUpperCase();
        System.out.println ("Your name is " + fullName);
        characters = fullName.length();
        System.out.println ("Your name has " + characters + " characters");
        System.out.println();

        // Calculate the volume of the sphere
        System.out.println ("What is the diameter of the sphere?");
        diameter = keyboard.nextDouble();
        radius = diameter / 2;
        volume = (4/3.0) * Math.PI * (Math.pow(radius, 3));
        System.out.println ("The volume of the sphere is " + volume);
    }
}