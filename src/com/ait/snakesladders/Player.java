package com.ait.snakesladders;

public class Player {
	private String name;
	private int positionOnBoard;

	public Player(String name) {
		this.name = name;
		positionOnBoard=1;
	}
	
	public void setPositionOnBoard(int positionOnBoard) {
		this.positionOnBoard=positionOnBoard;
	}
	
	public int getPositionOnBoard() {
		return positionOnBoard;
	}
	
	public String getName() {
		return name;
	}
		
}
