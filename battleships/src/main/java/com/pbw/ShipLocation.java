package com.pbw;

import java.util.Set;

public class ShipLocation {
	// Keep track of which points have been hit
	public ShipLocation(Set<Point> location) {
		this.location = location;
	}

	public Board.Result attack(Point cell) {
		if (location.contains(cell)) {
			location.remove(cell);
			if (location.isEmpty())
				return Board.Result.SUNK;
			else
				return Board.Result.HIT;
		} else {
			return Board.Result.MISS;
		}
	}

	Set<Point> location;
}
