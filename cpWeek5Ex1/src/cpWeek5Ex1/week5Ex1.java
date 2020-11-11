package cpWeek5Ex1;

import java.util.Scanner;

public class week5Ex1 {
	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		int num1, guess, i, numOfGuesses, dist;
		num1 = (int) (Math.random() * 100);
		numOfGuesses = 10;
		
		System.out.println("Guess the number between 1 and 100 in "+numOfGuesses+" guesses.");


		for(i = 1 ; i <= numOfGuesses;i++) {
			System.out.println("Guess "+i+":");
			guess = userIn.nextInt();
			
			if(num1 == guess) {
				System.out.println("Correct");
				break;
			}
			else if (num1 > guess) {
				dist = num1-guess;
				if(dist > 50) {
					System.out.println("The number is much greater than "+guess);
				}
				else {
				System.out.println("The number is greater than "+guess);
				}
			}
			else if (num1 < guess) {
				dist = guess - num1;
				if(dist > 50) {
					System.out.println("The number is much lower than "+guess);
				}
				else {
				System.out.println("The number is lower than "+guess);
				}
		}
	}
		if(i-1 == numOfGuesses) {
			System.out.println("You are out of guesses! The number was "+num1);
		}
}
}
