import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program is for ordering pizza, determining what was ordered 
 * and how to charge the user accordingly.
 */
public class PizzaOrder {
	public static void main (String [] args) {

        Scanner keyboard = new Scanner (System.in);
        DecimalFormat money = new DecimalFormat("#0.00");

        String firstName, crust, input;
        String toppings = "Cheese ";
        final String mike = "mike";
        final String diane = "diane";
        boolean discount = false;
        double cost, tax, total;
        final double TAX_RATE = .08;
        int inches, numberOfToppings;
        char choice, crustType;

		System.out.println("Welcome to Mike and Diane's Pizza");
		System.out.print("Enter your first name: ");
		firstName = keyboard.nextLine();

        if (firstName.equalsIgnoreCase(mike) || firstName.equalsIgnoreCase(diane))
            discount = true;

        System.out.println("Pizza Size (inches)   Cost");
        System.out.println("        10            $10.99");
        System.out.println("        12            $12.99");
        System.out.println("        14            $14.99");
        System.out.println("        16            $16.99");
        System.out.println("What size pizza would you like?");
        System.out.print("10, 12, 14, or 16 (enter the number only): ");
        inches = keyboard.nextInt();
      
        if (inches == 10)
            cost = 10.99;
        else if (inches == 12)
            cost = 12.99;
        else if (inches == 14)
            cost = 14.99;
        else if (inches == 16)
            cost = 16.99;
        else {
            System.out.println("The size you selected was invalid.");
            System.out.println("A 12 inch pizza will be made");
            inches = 12;
            cost = 12.99;
        }

        keyboard.nextLine();

        System.out.println("What type of crust do you want? ");
        System.out.print("(H)Hand-tossed, (T) Thin-crust, or " + "(D) Deep-dish (enter H, T, or D): ");
        input = keyboard.nextLine();
        crustType = input.charAt(0);

        switch (crustType) {
            case 'H':
                crust = "Hand-Tossed";
                break;
            case 'h':
                crust = "Hand-Tossed";
                break;
            case 'T':
                crust = "Thin-Crust";
                break;
            case 't':
                crust = "Thin-Crust";
                break;
            case 'D':
                crust = "Deep-Dish";
                break;
            case 'd':
                crust = "Deep-Dish";
                break;
            default: {
                System.out.println("You inputed an invalid Crust ");
                System.out.println("Hand-Tossed crust will be made.");
                crust = "Hand-Tossed";
            }
        }				

        System.out.println("All pizzas come with cheese.");
        System.out.println("Additional toppings are $1.25 each," + " choose from");
        System.out.println("Pepperoni, Sausage, Onion, Mushroom");

        System.out.print("Do you want Pepperoni?  (Y/N):  ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
            numberOfToppings += 1;
            toppings = toppings + "Pepperoni ";
        }

        System.out.print("Do you want Sausage?  (Y/N):  ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
	        numberOfToppings += 1;
	        toppings = toppings + "Sausage ";
	    }

        System.out.print("Do you want Onion?  (Y/N):  ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
	        numberOfToppings += 1;
	        toppings = toppings + "Onion ";
	    }

        System.out.print("Do you want Mushroom?  (Y/N):  ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
  	        numberOfToppings += 1;
	        toppings = toppings + "Mushroom ";
	    }

        cost = cost + (1.25*numberOfToppings);

        System.out.println();
        System.out.println("Your order is as follows: ");
        System.out.println(inches + " inch pizza");
        System.out.println(crust + " crust");
        System.out.println(toppings);
        if (discount) {
            System.out.println("You are eligable for a $2.00 discount!");
            cost -= 2.00;
        }

        System.out.println("The cost of your order is: $" + cost);

        tax = cost * TAX_RATE;
        total = tax + cost;
        System.out.println("The tax is:  $" + money.format(tax));
        System.out.println("The total due is:  $" + money.format(total));
        System.out.println("Your order will be ready for pickup in 30 minutes.");
    }	
}