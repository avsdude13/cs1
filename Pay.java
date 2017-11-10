import java.util.Scanner;

/**
 * This is a simple Java program that asks user for two 
 * integer numbers hours and rate. Then will calculate the
 * resulting pay for the hours worked and display the result
 */
public class Pay {
    public static void main(String [] args) {

        Scanner keyboard = new Scanner(System.in);
        double hours, rate, pay;
		
        System.out.print("How many hours did you work? ");
        hours = keyboard.nextDouble();

        System.out.print("How much do you get paid per hour? ");
        rate = keyboard.nextDouble();

        if(hours <= 40)
            pay = hours * rate;
        else
            pay = (hours - 40) * (1.5 * rate) + 40 * rate;

        System.out.println("You earned $" + pay);
    }
}
