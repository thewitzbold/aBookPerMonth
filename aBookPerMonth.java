
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class aBookPerMonth {
	public static void main(String[] args){

		//Read from file
		try{
			Scanner scan = new Scanner(new File("DATA.csv"));

			while (scan.hasNextLine()) {
        		String line = scan.nextLine();
        		String[] div = line.split(",");
        		book novel = new book(div[0], div[1], Integer.parseInt(div[2]));
        	}
        }
		catch( FileNotFoundException e ){
			System.out.println("File not found");
		}
		//Done

		book.printAll();
		book novel = new book("may","hello",257); //add a new book
		book.printAll();
	}
}