package com.pbw;

public class ChangeCounter {

	Change countChange(float value){
		Change change = new Change();
	    int pennies = Math.round(value*100);
		//Greedy algorithm
		change.quarters = (int) pennies/25;
		pennies %=25;
		change.nickels =(int)  pennies/10;
		pennies %=10;
		change.dimes =(int)  pennies/5;
		pennies %=5;
		change.pennies=(int) pennies;
	    return change;
	}

}
