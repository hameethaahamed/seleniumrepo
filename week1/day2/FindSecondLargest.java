package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};

		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		
		//invoking sort() method of the Arrays class  
		Arrays.sort(data);  
		//Pick the 2nd element from the last and print it
		
		System.out.println(data.length-1);
		System.out.println(data[data.length-1]);
		
	}
}


