/******************************************************
/    This program demonstrates static methods         /
/                 @ Matt Kline                        /
/                 @ October 12, 2014                  /
/                 @ Version 1                         /     
/*****************************************************/

import java.util.Scanner;

public class Geometry {
	public static void main (String [] args) {
		int choice;
		double value = 0;
		char letter;
		double radius;
		double length;
		double width;
		double height;
		double base;
		double side1;
		double side2;
		double side3;

		Scanner keyboard = new Scanner (System.in);

		do {
			printMenu();
	 		choice = keyboard.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter the radius of the circle:  ");
					radius = keyboard.nextDouble();
					value = circleArea(radius);
					System.out.println("The area of the circle is " + value);
					break;
				
            	case 2:
					System.out.print("Enter the length of the rectangle:  ");
					length = keyboard.nextDouble();
					System.out.print("Enter the width of the rectangle:  ");
					width = keyboard.nextDouble();
					value = rectangleArea(length, width);
					System.out.println("The area of the rectangle is " + value);
					break;
				
            	case 3: 
					System.out.print("Enter the height of the triangle:  ");
					height = keyboard.nextDouble();
					System.out.print("Enter the base of the triangle:  ");
					base = keyboard.nextDouble();
					value = triangleArea(base, height);
					System.out.println("The area of the triangle is " + value);
					break;
				
            	case 4:
					System.out.print("Enter the radius of the circle:  ");
					radius = keyboard.nextDouble();
					value = circleCircumference(radius);
					System.out.println("The circumference of the circle is " + value);
					break;
				
            	case 5:
					System.out.print("Enter the length of the rectangle:  ");
					length = keyboard.nextDouble();
					System.out.print("Enter the width of the rectangle:  ");
					width = keyboard.nextDouble();
					value = rectanglePerimeter(length, width);
					System.out.println("The perimeter of the rectangle is " + value);
					break;
				
            	case 6:
					System.out.print("Enter the length of side 1 of the triangle:  ");
					side1 = keyboard.nextDouble();
					System.out.print("Enter the length of side 2 of the triangle:  ");
					side2 = keyboard.nextDouble();
					System.out.print("Enter the length of side 3 of the triangle:  ");
					side3 = keyboard.nextDouble();
					value = trianglePerimeter(side1, side2, side3);
					System.out.println("The perimeter of the triangle is " + value);
					break;
				
            	default:
					System.out.println("You did not enter a valid choice.");
			}	
         	keyboard.nextLine();
			System.out.println("Do you want to exit the program (Y/N)?:  ");
			String answer = keyboard.nextLine();                                       
			letter = answer.charAt(0);
		}
        while (letter != 'Y' && letter != 'y');
	}  

    /**
     * This Method is used to display the menu at the beggining of the program 
     */  
    public static void printMenu() {
	    System.out.println ("This is a geometry calculator.");
	    System.out.println ("Choose what you would like to calculate.");
	    System.out.println ("1. Find the area of a circle");
	    System.out.println ("2. Find the area of a rectangle");
	    System.out.println ("3. Find the area of a triangle");
	    System.out.println ("4. Find the circumference of a circle");
	    System.out.println ("5. Find the perimeter of a rectangle");
	    System.out.println ("6. Find the perimeter of a triangle");
	    System.out.println ("Enter the number of your choice:");
    }

	/**   
	 * This method is used to calculate area of a circle.  
	 * This method needs the users input of radius to run. 
	 * @param radius takes users input and uses radius in the equation
	 * @return value takes the result from the equation and saves it as value
	*/   
    public static double circleArea(double radius) {
        double value;
        value = (Math.PI * Math.pow(radius, 2));
        return value;
    }

	/**   
	 * This method is used to calculate area of a rectangle. 
	 * This method needs the users input of length and width to run.  
	 * @param length takes users input and uses length in the equation
	 * @param width takes users input and uses width in the equation
	 * @return value takes the result from the equation and saves it as value
	*/     
    public static double rectangleArea(double length, double width) {   
        double value;
        value = (length * width);
        return value;
    }

	/**   
	 * This method is used to calculate area of a triangle.  
	 * This method needs the users input of base and height to run. 
	 * @param base takes users input and uses base in the equation
	 * @param height takes users input and uses height in the equation
	 * @return value takes the result from the equation and saves it as value
	*/  
    public static double triangleArea(double base, double height) {
        double value;
        value = (.5 * base * height);
        return value;
    }

	/**   
	 * This method is used to calculate the circumference of a circle.
	 * This method needs the users input of radius to run.   
	 * @param radius takes users input and uses radius in the equation
	 * @return value takes the result from the equation and saves it as value
	*/  
    public static double circleCircumference(double radius) {
        double value;
        value = (2 * Math.PI * radius);
        return value;
    }

	/**   
	 * This method is used to calculate the perimeter of a rectangle.
	 * This method needs the users input of length and width to run.   
	 * @param length takes users input and uses length in the equation
	 * @param width takes users input and uses width in the equation
	 * @return value takes the result from the equation and saves it as value
	*/ 
    public static double rectanglePerimeter(double length, double width) {
        double value;
        value = ((2 * length) + (2 * width));
        return value;
    }

	/**   
	 * This method is used to calculate the perimeter of a triangle.
	 * This method needs the users input of side1, side2 and side3 to run.   
	 * @param side1 takes users input and uses side1 in the equation
	 * @param side2 takes users input and uses side2 in the equation
	 * @param side3 takes users input and uses side3 in the equation
	 * @return value takes the result from the equation and saves it as value
	*/ 
    public static double trianglePerimeter(double side1, double side2, double side3) {
        double value;
        value = (side1 + side2 + side3);
        return value;
    }
}