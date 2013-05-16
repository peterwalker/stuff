package com.pbw

import spock.lang.*

class FibonacciSpec extends Specification {
	Fibonacci fibonacci = new Fibonacci()
	@Unroll
	def "test fibonacci sequences" (int value, int[] sequence){
		expect:
		fibonacci.sequence(value)==sequence
		where:
		value	| sequence
		0	|	[0]
		1	| 	[0, 1]
		2	|	[0, 1, 1]
		3	|	[0, 1, 1, 2]
		4	|	[0, 1, 1, 2, 3]
		5	|	[0, 1, 1, 2, 3, 5]
	}
}
