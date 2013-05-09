package com.pbw;

public class BitCounter {
	private int[] bit16Map;

	static int numberOfBits(int value){
		System.out.println("Beginning value:" + value);
		int count = 0;
	    while (value > 0) {           // until all bits are zero
	        if ((value & 1) == 1)     // check lower bit
	            count++;
	        value >>= 1;              // shift bits, removing lower bit
	    }
		System.out.println("Finished value");
	    return count;
	}
	
	//we could use this method to prefill the array, and keep for subsequent tests.
    void preFillarray()
	{
    	bit16Map = new int[Short.MAX_VALUE];
    	for (int i=0;i<Short.MAX_VALUE;++i){
    		bit16Map[i] = numberOfBits(i);
    	}
	}
	
    static int fastBits(int value){
    	int highValue = value >> 16;
    	int lowValue = value & 0xFFFF;
    	System.out.println( "value:" + value);
    	System.out.println( "lowValue:" + lowValue);
    	System.out.println( "highValue:" + highValue);
	    return 0;
	}
    
    public static void main(String [] args)
	{
    	BitCounter bc = new BitCounter();
    	//bc.preFillarray();
    	bc.fastBits(555);
    	bc.fastBits(2147483647);

	}
}
