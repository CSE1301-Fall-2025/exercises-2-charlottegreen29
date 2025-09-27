package module4._01text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;  // wow that's a lot of imports

public class E01Stats {

	/*
	 * Exercise: The below code reads in a series of doubles from a file and prints them.
	 * Modify this code to find the maximum, minimum, average, and count of the values
	 * read in from the file.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//Code for setting up Scanner with a file
		//Not your responsibility to understand this part!
		JFileChooser chooser = new JFileChooser("datafiles");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		
		//Using scanner to read from a file
		//Modify and add to the code below
		//to complete the exercise

		double min = 999999999999999999999999999999999999999999999999999999999999999999999999999.9;
		double max = 0;
		double total = 0;
		int count = 0;

		while(in.hasNextDouble()) {
			double nextDouble = in.nextDouble();
			if (min>nextDouble){
				min=nextDouble;
			}
			if (max<nextDouble){
				max=nextDouble;
			}
			total+=nextDouble;
			count++;
		}

		double average = total/count;
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Average: " + average);
		System.out.println("Number of values in file: " + count);
	}
}
