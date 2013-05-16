package com.pbw

import spock.lang.*

class PalindromeSpec extends Specification {
	Palindrome palindrome = new Palindrome()
	@Unroll
	def "Test words for palindome" (String sentence, boolean isPalindrome){
		expect:
		palindrome.isPalindrome(sentence)==isPalindrome
		where:
		sentence	| isPalindrome
		"madam"		|	true
		"Able was I ere I saw Elba"	|	true
		"foobar"| 	false
	}
}
