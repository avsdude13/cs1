import java.util.Scanner;
import java.util.Formatter;

/**
 * This is a simple Java program that asks user for two 
 * integer numbers and an arithmetic operator (+, -, *, or /).
 * It performs the given arithmetic operation on the numbers
 * and displays the result.
 */
public class simpleArithmetic {
    public static void main (String[] args) {

    Scanner input = new Scanner(System.in);
    Formatter output = new Formatter (System.out);
    int value1, value2, result = 0;
    char operation;
    boolean done = false;

    while (!done) {
        System.out.println ("Enter the first number");
        value1 = input.nextInt();

        System.out.println ("Enter the second number");
        value2 = input.nextInt();

        System.out.println ("Enter the operator: +, -, *, /");
        operation = input.next().charAt(0);

        if (operation == '+')
            result = value1 + value2;
        else if (operation == '-')
            result = value1 - value2;
        else if (operation == '*')
            result = value1 * value2;
        else if (operation == '/')
            result = value1 / value2;
        else {
            System.out.println ("Error: Invalid Operator.");
            result = 0;
        }

        output.format ("Result is: %d %n", result);

        System.out.println ("======================");
        System.out.println ("More Calculation (Enter Y or N)");
        operation = input.next().charAt(0);

        if (operation == 'N')
            done = true;
        }
    }
}
