package com.ait.snakesladders;

public class Die {
	     private int value;
	    private static int SIDES=6;
	    
	    // roll the die
	    public void roll()
	    {
	        value = (int) (Math.random() * SIDES);  // number from 0 to sides
	        value++;
	    }

	    public int getValue()
	    {
	        return value;
	    }
	    
	   
}
/*
 //Comment out the code above and uncomment this to get the test sequence 1,1,2,3,4
public class Die {

	int value;
	private int count = 0; // for testing purposes
	int values[] = { 1, 1, 2, 3, 4 };// for testing purposes

	// roll the die
	public void roll() {
		value = values[count];
		count++;
	}

	public int getValue() {
		return value;
	}

}
*/
