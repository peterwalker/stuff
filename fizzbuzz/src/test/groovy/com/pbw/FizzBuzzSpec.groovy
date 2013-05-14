package com.pbw
import spock.lang.Specification
import spock.lang.Unroll


class FizzBuzzSpec extends Specification{
	FizzBuzz fb = new FizzBuzz()

	@Unroll
	def "tests for fizzbuzz"(int input, String answer) {

		expect:
		fb.check(input)==answer

		where:
		input | answer
		1  	  |    ""
		3     |    "Fizz"
		5     |    "Buzz"
		15    |    "FizzBuzz"
	}
}
