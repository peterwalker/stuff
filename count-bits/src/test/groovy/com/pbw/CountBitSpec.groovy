package com.pbw

import spock.lang.Specification

class CountBitSpec extends Specification {
	def "counts the bits in an integer"(int i, int bits) {
		expect:
		BitCounter.numberOfBits(i) == bits

		where:
		i | bits 
		7 | 3 
		8 | 1 
		9 | 2
		4294967296 | 32
	}
}
