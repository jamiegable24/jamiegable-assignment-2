package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		int guesses = 5;
		boolean gameOver = false;
		Random theRandomNumber = new Random();
		int rndm = theRandomNumber.nextInt(101);

		System.out.println("Pick a number between 1 and 100");
		Scanner scanner = new Scanner(System.in);

		while (!gameOver) {
			int userGuess = scanner.nextInt();
			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again: ");
			} else {
				if (userGuess == rndm) {
					System.out.println("You win!");
					gameOver = true;
				} else {
					guesses--;
					if (guesses == 0) {
						System.out.println("Sorry, you lose! The correct number was: " + rndm);
						gameOver = true;
					} else {
						if (userGuess < rndm) {
							System.out.println("Please pick a higher number: ");
						} else {
							System.out.println("Please pick a lower number: ");
						}
					}
				}
			}
		}
	}
}
