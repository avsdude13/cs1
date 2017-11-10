import java.util.Scanner;

/**
 * This is a simple Java program that asks user for two 
 * inputs. A string listing the item and number price.
 * It calculates the sales tax for the item and will return
 * an itemized total showing item cost, tax and total.
 */
public class SalesTax {
    public static void main(String[] args) {
        final double TAX_RATE = 0.055;
        double price, tax, total;
        String item;
      
        Scanner keyboard = new Scanner(System.in);
      
        System.out.print("Item description: ");
        item = keyboard.nextLine();
        
        System.out.print("Item price: $");
        price = keyboard.nextDouble();
      
        tax = price * TAX_RATE;
        total = price + tax;
      
        System.out.print(item + "   $");
        System.out.println(price);
        System.out.print("Tax       $");
        System.out.println(tax);
        System.out.print("Total     $");
        System.out.println(total);
    }
}
