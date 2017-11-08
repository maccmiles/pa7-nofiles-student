package edu.wit.cs.comp1000;
import java.util.Scanner;
/**
 * PA7b
 * @author Miles Macchiaroli
 *
 */
public class PA7b {

	/**
	 * Program execution point:
	 * input text via console input,
	 * output counts for each letter
	 * found in the input (case-insensitive)
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		int[] index = new int[25];//int new array a=0...z=25
		String in;//create string
		Scanner input = new Scanner(System.in);//call scanner object
		System.out.printf("Enter text: ");
		in = input.nextLine();//set string to entered line 
		count(in, index);//call calculation method with string
		print(index);//Call print method
	}
	/**
	 * Counts through string, separating characters into the index
	 * @param in string from string object, index: array
	 */
public static void count(String in, int[] index) {
	int calc, length = in.length();//find length of string
	char current; // current character
	for (int i = 0; i < length; i++) {
		current = in.charAt(i);//pull next character
		calc = current - 'a';//set char to numerical value
		if (calc < 0) { calc = calc + 32;}//if outside range, attempt to convert for capital, (Add 32)
		if ((calc < 0) || (calc > 25)){}//If still out-of-range, cancel increment operation
		else{index[calc]++;//increment indexed value by one
		}
	}
}
/**
 * Handles all output from program, sifts through array,
 * prints according values
 * @param int[] index: numerical array
 */
public static void print(int[] index) {
	char letter = 'A';//Sets starting Character
	for (int i = 0; i < 25; i++) {
		if (index[i] > 0) {System.out.printf("%c: %d%n", letter, index[i]);}//if number is >0, print letter and value
		letter++;//increment letter counter
	}
}
}