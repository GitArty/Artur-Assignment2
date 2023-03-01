package com.coderscampus.Assignment2;

import java.util.Random;
import java.util.Scanner;

public class ArturAssignment2 {

	public static void main(String[] args) {

		int randomNumber = new Random().nextInt(100) + 1;
		int numGuesses = 5;

		System.out.println("I am thinking of a number between 1 and 100. Choose my number in 5 guesses and you win!");

		Scanner scanner = new Scanner(System.in);
		{
			while (numGuesses > 0) {
				System.out.println("Guess #" + (6 - numGuesses) + ":");
				int guess = scanner.nextInt();
				if (guess < 1 || guess > 100) {
					System.out.println("Your guess is not between 1 and 100, please try again.");
				} else if (guess < randomNumber) {
					System.out.println("Please pick a higher number.");
					numGuesses--;
				} else if (guess > randomNumber) {
					System.out.println("Please pick a lower number.");
					numGuesses--;
				} else {
					System.out.println("You win!");
					return;
				}
			}
		}
		System.out.println("You lose! \nThe number to guess was: " + randomNumber);
	}
}
