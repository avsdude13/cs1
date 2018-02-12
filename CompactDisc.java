import java.util.Scanner;
import java.io.*;

public class CompactDisc {
	public static void main(String [] args) throws IOException {
		File file = new File("Classics.txt");
		Scanner input = new Scanner(file);
		
		String title;
		String artist;
	   
        Song[] cd = new Song [6];
		
		for (int i = 0; i < cd.length; i++) {
			title = input.nextLine();
			artist = input.nextLine();	
			Song name = new Song (title, artist);
            name.toString();
            cd[i] = name;
		}
		
		System.out.println("Contents of Classics:");
        System.out.println("");
		
		for (int i = 0; i < cd.length; i++) {
			System.out.println (cd[i]);
		}
	}
}