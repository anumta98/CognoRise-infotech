package cognoRise_intership;

import java.util.Random;
import java.util.Scanner;



public class NumberGuessingGame {
	
	public static void guessNumber() {
		
		Scanner sc = new Scanner(System.in);
		Random rndm = new Random();
		
		int randomNum = rndm.nextInt(100)+1;//generates a random number between 1 t0 100
		int attempts =0;
		int maxAttempts =5;
		
		System.out.println("welcome to Number Guessing Number Game");
		
		//loop until maximum attempts reach
		while(attempts < maxAttempts) {
			System.out.println("Guess a number between 1 to 100");
			int guess = sc.nextInt();
			attempts++;
			//checking if the guess is correct
			if(guess == randomNum) {
				System.out.println("you guessed the correct number");
				break; 
			}else if (guess < randomNum) {
				System.out.println("the number is greater than "+guess+" try again");
				
			}else {
				System.out.println("the number is less than "+guess+" try again");
				
			}
			//check if the maximum attempts have reached
			if(attempts==maxAttempts) {
				System.out.println("you have reached the maximum number of attemts");
			}
		}
		
		}
	public static void main(String[] args) {
		guessNumber();
		
	}
		
	
	}


