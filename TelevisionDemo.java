/******************************************************
/  This program demonstrates the television class     /
/                 @ Matt Kline                        /
/                 @ Due 11/04/2014                    /
/                 @ Version 1                         /     
/*****************************************************/

import java.util.Scanner;

public class TelevisionDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);

		int station;

		Television bigScreen = new Television("Toshiba", 55);

		bigScreen.power();

		System.out.println("A " + bigScreen.getScreenSize() + " inch " +
			bigScreen.getManufacturer()	+ " has been turned on.");

		System.out.print("What channel do you want?  ");
		station = keyboard.nextInt();

		bigScreen.setChannel(station);

		bigScreen.increaseVolume();

		System.out.println("Channel: " + bigScreen.getChannel() + "Volume: " + bigScreen.getVolume());
		System.out.println("Too loud!! I am lowering the volume.");

		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();

		System.out.println("Channel: " + bigScreen.getChannel() + "Volume: " + bigScreen.getVolume());
		System.out.println();
		
        Television portable = new Television("Sharp", 19);

		portable.power();

		System.out.println("A " + portable.getScreenSize() + " inch " + portable.getManufacturer()	+ " has been turned on.");
         
		System.out.print("What channel do you want?  ");
		station = keyboard.nextInt();

		portable.setChannel(station);

		portable.decreaseVolume();
		portable.decreaseVolume();

		System.out.println("Channel:  " + portable.getChannel() + "Volume: " + portable.getVolume());
	}
}