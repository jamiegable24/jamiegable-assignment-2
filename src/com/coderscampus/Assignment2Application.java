package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		int guesses = 5;
		Random theRandomNumber = new Random();
		int rndm = theRandomNumber.nextInt(101);

		System.out.println("Pick a number between 1 and 100");
		Scanner scanner = new Scanner(System.in);
		int userGuess = scanner.nextInt();

		while (userGuess < 1 || userGuess > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again: ");
			userGuess = scanner.nextInt();
		}

		while (userGuess != rndm && guesses > 1) 
			{
			if (userGuess != rndm) {
				System.out.println("That is not it! You have " + (guesses - 1) + (" guesses left."));
			}
			if (userGuess < rndm) {
				System.out.println("Please pick a higher number: ");
				userGuess = scanner.nextInt();
				guesses--;
			}
			if (userGuess > rndm) {
				System.out.println("Please pick a lower number: ");
				userGuess = scanner.nextInt();
				guesses--;
			}
			
			if (userGuess < 1 || userGuess > 100) {
					guesses = guesses +1;
			}
			
			if (userGuess == rndm) {
				System.out.println("You win!");
			} else if (guesses == 1) {
				System.out.println("Sorry, you lose! The correct number was: " + rndm);
			}

		}
	}
}
