package day2.classroom.arrays;

import java.util.Arrays;

public class FindSecondLargest {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7}; //2,3,4,6,7,11

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the last but one and print
		 */
		Arrays.sort(data);
		
		//int secLar = data.length-2;
			System.out.println("The 2nd largest number is "+data[data.length-2]);
		//System.out.println("The 2nd largest number is "+data[secLar]);
		// Print the second largest number	
		
		
	}

}
