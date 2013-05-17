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

	def "ship location not on the board x"() {
		when:
		Board b = new Board(1)
		Set<Point> location = new HashSet()
		location.add(new Point(2,0))
		b.addShipLocation(location)

		then:
		thrown(BattleShipException)
	}

	def "ship location not on the board y"() {
		when:
		Board b = new Board(1)
		Set<Point> location = new HashSet()
		location.add(new Point(0,2))
		b.addShipLocation(location)

		then:
		thrown(BattleShipException)
	}

	def "attack location not on the board x"() {
		when:
		Board b = new Board(1)
		Set<Point> location = new HashSet()
		location.add(new Point(0,0))
		b.addShipLocation(location)
		b.attack(new Point(0,2))

		then:
		thrown(BattleShipException)
	}

	def "attack location not on the board y"() {
		when:
		Board b = new Board(1)
		Set<Point> location = new HashSet()
		location.add(new Point(0,0))
		b.addShipLocation(location)
		b.attack(new Point(2,0))

		then:
		thrown(BattleShipException)
	}
}
