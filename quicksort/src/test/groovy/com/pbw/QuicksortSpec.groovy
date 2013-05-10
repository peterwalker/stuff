package com.pbw

import spock.lang.*

class QuicksortSpec extends Specification {
    Quicksort qs = new Quicksort()
	
	@Unroll
	def "sort these arrays" (int[] unsorted, int[] sorted){
		when:
		qs.sort(unsorted)
		
		then:
		qs.sorted == sorted
		
		where:
		unsorted | sorted 
		[1,0]	 | [0,1]  
		[ 5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5 ] | [4,4,4,4,5,5,5,5,5,5,6,6,6,6]
		[ 1,4,7,11,2,5,8,12,3,6,9,2] | [1,2,2,3,4,5,6,7,8,9,11,12]
		[]       | [] 
	}
}
