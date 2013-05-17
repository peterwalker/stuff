package com.pbw

import spock.lang.Specification

class BattleshipSpec extends Specification {
	def "one ship sunk" () {
		when:
		Board b = new Board(1)
		Set<Point> location = new HashSet()
		location.add(new Point(0,0))
		b.addShipLocation(location)

		then:
		b.attack(new Point(0,0))==Board.Result.SUNK
	}

	def "one ship hit and sunk" () {
		when:
		Board b = new Board(2)
		Set<Point> location = new HashSet()
		location.add(new Point(0,0))
		location.add(new Point(0,1))
		b.addShipLocation(location)

		then:
		b.attack(new Point(0,0))==Board.Result.HIT
		b.attack(new Point(0,1))==Board.Result.SUNK
	}


	def "one ship miss hit and sunk" (){
		when:
		Board b = new Board(2)
		Set<Point> location = new HashSet()
		location.add(new Point(0,0))
		location.add(new Point(0,1))
		b.addShipLocation(location)

		then:
		b.attack(new Point(1,1))==Board.Result.MISS
		b.attack(new Point(0,0))==Board.Result.HIT
		b.attack(new Point(0,1))==Board.Result.SUNK
	}
}
