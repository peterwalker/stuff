package com.pbw;

public class ChangeCounter {

	Change countChange(double value){
		Change change = new Change();
		int pennies = (int) (value*100);
		//Greedy algorithm
		change.quarters = pennies/25;
		pennies %=25;
		change.nickels = pennies/10;
		pennies %=10;
		change.dimes = pennies/5;
		pennies %=5;
		change.pennies=pennies;
		pennies %=1;//for completeness
	    return change;
	}

}
