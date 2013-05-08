package com.pbw;

public class BitCounter {
	
	
	static int numberOfBits(int value){
		int count = 0;
	    while (value > 0) {           // until all bits are zero
	        if ((value & 1) == 1)     // check lower bit
	            count++;
	        value >>= 1;              // shift bits, removing lower bit
	    }
	    return count;
	}
	
	//we could use this method to prefill the array, and keep for subsequent tests.
	
}
