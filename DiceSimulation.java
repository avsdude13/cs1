/***************************************************************************
/   This class simulates rolling a pair of dice 10,000 times and           /
/   counts the number of times doubles of are rolled for each different    /
/   pair of doubles.                                                       /
/                          @ Matt Kline                                    /  
/                          @ September 30,2014                             /  
/                          @ Homework #5                                   /
/                          @ Version 1                                     /
***************************************************************************/ 

import java.util.Random;
public class DiceSimulation
{
	public static void main(String[] args)
	{
		final int NUMBER = 10000;

		Random generator = new Random();

		int die1Value;
		int die2Value;
		int count = 0;
		int snakeEyes = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;

      while (count<10000) {
         die1Value = generator.nextInt(6) + 1;
         die2Value = generator.nextInt(6) + 1;
         ++count;

        if (die1Value == die2Value) {
           if (die1Value == 1)
              ++snakeEyes;
           else if (die1Value == 2)
              ++twos;
           else if (die1Value == 3)
              ++threes;
           else if (die1Value == 4)
              ++fours;
           else if (die1Value == 5)
              ++fives;
           else if (die1Value == 6)
              ++sixes;
        }
     }
      
		System.out.println ("You rolled snake eyes " + snakeEyes + 
			" out of " + count + " rolls.");
		System.out.println ("You rolled double twos " + twos + 
			" out of " + count + " rolls.");
		System.out.println ("You rolled double threes " + threes + 
			" out of " + count + " rolls.");
		System.out.println ("You rolled double fours " + fours + 
			" out of " + count + " rolls.");
		System.out.println ("You rolled double fives " + fives + 
			" out of " + count + " rolls.");
		System.out.println ("You rolled double sixes " + sixes + 
			" out of " + count + " rolls.");
	}
}