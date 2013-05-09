package com.pbw

import spock.lang.*

class QuicksortSpec extends Specification {
	static Quicksort qs = new Quicksort()
	
	@Unroll
	def "sort these arrays" (int[] unsorted, int[] sorted){
		expect:
		qs.sort(unsorted) == sorted
		
		where:
		unsorted | sorted 
		[1,0]	 | [0,1]  
	}
}
