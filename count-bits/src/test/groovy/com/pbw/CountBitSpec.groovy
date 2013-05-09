package com.pbw

import spock.lang.*

class CountBitSpec extends Specification {
	static BitCounter bc = new BitCounter()
	
	@Unroll
	def "counts the bits in an integer"(int value, int bits) {
		expect:
		bc.numberOfBits(value) == bits
		bc.fastBits(value) == bits
		
		where:
		value | bits 
		0 | 0
		1 | 1
		2 | 1
		7 | 3 
		8 | 1 
		9 | 2
		2147483647 | 31
	}
	
}
