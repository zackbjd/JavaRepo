package com.ait.snakesladders;
//A00267383
public class Board {
	private Player player;
	private int WINPOINT = 12;
	private int SNAKEMOUTH = 11;
	private int SNAKETAIL = 5;
	private int LADDER1BOTTOM = 2;
	private int LADDER1TOP = 6;
	private int LADDER2BOTTOM = 7;
	private int LADDER2TOP = 9;

	public Board(Player player) {
		this.player = player;
	}

	public void movePlayer(int diceRoll) {
		System.out.println(player.getName() + " rolled " + diceRoll);

		if (player.getPositionOnBoard() + diceRoll == LADDER1BOTTOM) {
			System.out.println("Climbing up the ladder from " + LADDER1BOTTOM + " to " + LADDER1TOP);
			player.setPositionOnBoard(LADDER1TOP);
		} else if (player.getPositionOnBoard() + diceRoll == LADDER2BOTTOM) {
			System.out.println("Climbing up the ladder from " + LADDER2BOTTOM + " to " + LADDER2TOP);
			player.setPositionOnBoard(LADDER2TOP);
		} else if (player.getPositionOnBoard() + diceRoll == SNAKEMOUTH) {
			System.out.println("Sliding down the snake from " + SNAKEMOUTH + " to " + SNAKETAIL);
			player.setPositionOnBoard(SNAKETAIL);
		} else if (player.getPositionOnBoard() + diceRoll > WINPOINT) {
			System.out.println(player.getName() + " has exceeded " + WINPOINT);
			System.out.println(player.getName() + " stays on " + player.getPositionOnBoard());
		} else {

			player.setPositionOnBoard(diceRoll + player.getPositionOnBoard());
			System.out.println("Moving " + player.getName() + " to square " + player.getPositionOnBoard());
		}

	}

	public boolean checkForWinner() {
		boolean winner = false;

		if (player.getPositionOnBoard() == WINPOINT) {
			winner = true;
		}

		return winner;
	}
}
