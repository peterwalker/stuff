package com.pbw

import spock.lang.*

class SortedIntegerArrayIntersectionSpec extends Specification {
	static SortedIntegerArrayIntersectionCalculator siaic = new SortedIntegerArrayIntersectionCalculator()
	
	@Unroll
	def "counts the bits in an integer"(int[] lhs, int[] rhs, int[] result) {
		expect:
		siaic.intersection(lhs,rhs) == result
		
		where:
		lhs 	| rhs 	| result 
		[0,1]	| [1,2] | [1]
		[0] 	| [1]   | []
		[2,3,4] |[2,3,4]| [2,3,4]
		[]		|[]		|[]
		[4,4,4,4,5,5,5,5,5,5,6,6,6,6]|[1,2,2,3,4,5,6,7,8,9,11,12]|[4,4,4,4,5,5,5,5,5,5,6,6,6,6]
	}	
}
