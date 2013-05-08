package com.pbw

import spock.lang.*

class CountBitSpec extends Specification {
	@Unroll
	def "counts the bits in an integer"(int value, int bits) {
		expect:
		BitCounter.numberOfBits(value) == bits

		where:
		value | bits 
		7 | 3 
		8 | 1 
		9 | 2
		2147483647 | 31
	}
	
	
}
