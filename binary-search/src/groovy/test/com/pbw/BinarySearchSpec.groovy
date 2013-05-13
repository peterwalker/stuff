package com.pbw
import spock.lang.*
class BinarySearchSpec extends Specification {
	BinarySearch bs = new BinarySearch()

	@Unroll
	def "find element in sorted array" (int[] sorted, int value, int index){
		expect:
		bs.bsearch(sorted,value)==index
		where:
		sorted	| value | index
		[0, 1]|   2	| 	-1
		[]|	0	| 	-1
		[
			1,
			2,
			3,
			4,
			5,
			6,
			7,
			8,
			9,
			10,
			11,
			12
		]|9|8
	}
}
