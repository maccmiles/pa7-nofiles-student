package edu.wit.cs.comp1000;

import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * PA7a
 * @author Miles Macchiaroli
 *
 */
public class PA7a {
	
	/**
	 * Reads all values from the provided scanner
	 * into the supplied array (up to its size)
	 * and returns the number of integers read
	 * 
	 * @param input input source
	 * @param nums destination for read integers
	 * @return number of integers read
	 */
	public static int readIntoArray(Scanner input, int[] nums) {
		int numTotal = 0;//Total numbers read to array
		for (int i = 0; i < 100; i++) {
			try{nums[i] = input.nextInt();}//attempt to add ints to array
			catch(NoSuchElementException e){break;}//when no int available
			numTotal++;
		}
		
		return numTotal;
	}
	
	/**
	 * Prints to the screen the average of the supplied array,
	 * up to the supplied size, and all integers in the array, 
	 * again up to the supplied size, that are larger than the average
	 * 
	 * @param nums array of numbers
	 * @param size number of valid elements
	 */
	public static void printAboveAverage(int[] nums, int size) {
		double avg = 0;
		String above = "";
		for (int i = 0; i < size; i++) {
			avg = avg + nums[i];//add all numbers together
		}
		if (size != 0){avg = avg / size;}//if array is populated, calculate avg
		else {avg = 0;}//else set 0, prevent impossible division
		System.out.printf("Average: %.2f%n", avg);//print avg
		////
		System.out.printf("Values above average:");
		for (int i = 0; i < size; i++) {//check any numbers over avg
			if(nums[i] > avg) {
		above += " nums[" + i + "]=" + nums[i] + ",";}//fabricate string
		}
		if (above.length() == 0) {
			System.out.printf(" none%n");//print 'none' if string is empty
			}
		else {
			above = above.substring(0, above.length()-1);//remove extra ',' from string
			System.out.printf("%s%n", above);
		}
		}

	/**
	 * Program execution point:
	 * input a sequence of integers (up to 100),
	 * output average of integers and those over the average
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		int nums[] = new int[100];//set new array
		int size = 0;
		Scanner input = new Scanner(System.in);//call Scanner
		System.out.printf("Enter up to 100 integers: ");
		size = readIntoArray(input, nums);//send input of scanner to Method
		printAboveAverage(nums, size);//Request average to be calculated and printed
		
	}

}
