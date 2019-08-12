package com.ait.snakesladders;

import java.util.Scanner;
//A00267383
public class Game {

	private Scanner sc = new Scanner(System.in);
	private int numDiceRolls;

	public void start() {
		System.out.println("Welcome to Snakes and Ladders");
		System.out.println("Get to the finish in 6 dice rolls or less to win");
		System.out.println("Please enter player name: ");
		Player player = new Player(sc.next());
		Die die = new Die();

		Board board = new Board(player);

		System.out.println("Start the game? (y/n)");
		String cont = sc.next();

		while (cont.equalsIgnoreCase("y")) {
			numDiceRolls++;
			die.roll();
			System.out.println("DICE ROLL NUMBER " + numDiceRolls);
			board.movePlayer(die.getValue());

			if (board.checkForWinner()) {
				System.out.println(player.getName() + " has reached win point in " + numDiceRolls);
				System.out.println("We have a winner");
				cont = "n";
				continue;
			}

			if (numDiceRolls == 6) {
				System.out.println("Dice has been rolled 6 times - you lose - game over");
				cont = "n";
			} else {
				System.out.println("Roll the dice again? (y/n): ");
				cont = sc.next();
			}
		}

		if (cont.equalsIgnoreCase("n")) {
			System.out.println("Goodbye");
		}
	}
}
