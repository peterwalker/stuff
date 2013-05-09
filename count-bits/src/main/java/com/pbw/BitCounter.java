package com.pbw;

public class BitCounter {
	BitCounter(){
		preFill16Bitarray();
		
	}
	
	private int[] bit16Map;

	int numberOfBits(int value){
		int count = 0;
	    while (value > 0) {           // until all bits are zero
	        if ((value & 1) == 1)     // check lower bit
	            count++;
	        value >>= 1;              // shift bits, removing lower bit
	    }
	    return count;
	}
	
	
    void preFill16Bitarray()
	{
    	bit16Map = new int[65536];
    	for (int i=0;i<bit16Map.length;++i){
    		bit16Map[i] = numberOfBits(i);
    	}
	}
	
     int fastBits(int value){
    	int highValue = value >> 16;
    	int lowValue = value & 0xFFFF;
    	int bitCount = bit16Map[lowValue] + bit16Map[highValue];
	    return bitCount;
	}
    
    public static void main(String [] args)
	{
    	BitCounter bc = new BitCounter();
    	bc.preFill16Bitarray();
    	bc.fastBits(555);
    	bc.fastBits(2147483647);

	}
}
