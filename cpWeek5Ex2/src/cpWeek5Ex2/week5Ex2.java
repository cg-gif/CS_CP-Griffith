package cpWeek5Ex2;

import java.lang.*;
import java.util.*;

public class week5Ex2 {
	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		int randNum, i, total = 0, average;

		// create a empty array
		int randNumArray[] = new int[20];

		// Run loop until all positions of array are filled
		for (i = 1; i <= randNumArray.length; i++) {
			// put random numbers in the array
			randNumArray[i - 1] = (int) (Math.random() * 1000);

			// cal total for average
			total += randNumArray[i - 1];
		}

		// get average
		average = total / randNumArray.length;

		// sort array
		Arrays.sort(randNumArray);

		// print results
		System.out.println("Sorted array: " + Arrays.toString(randNumArray));
		System.out.println("The smallest number is " + randNumArray[0]);
		System.out.println("The largest number is " + randNumArray[randNumArray.length - 1]);
		System.out.println("The average of all the numbers is " + average);
	}
}
