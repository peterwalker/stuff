package com.pbw

import spock.lang.*

class CountChangeSpec extends Specification {
	static ChangeCounter cc = new ChangeCounter()
	
	@Unroll
	def "counts the change for a dollar amount"(double amount, int quarters, int nickels, int dimes, int pennies) {
		expect:
		Change change = cc.countChange(amount)
		change.quarters == quarters
		change.nickels == nickels
		change.dimes == dimes
		change.pennies == pennies
		
		where:
		amount | quarters |nickels|dimes|pennies
		0  	   |    0     |   0   |  0  |   0
		0.25   |    1     |   0   |  0  |   0 
		0.26   |    1     |   0   |  0  |   1
		0.27   |    1     |   0   |  0  |   2
		0.28   |    1     |   0   |  0  |   3
//		0.29   |    1     |   0   |  0  |   4
		0.30   |    1     |   0   |  1  |   0
		0.35   |    1     |   1   |  0  |   0
		1.01   |    4     |   0   |  0  |   1
	}
}
