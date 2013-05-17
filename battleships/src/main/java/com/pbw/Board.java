package com.pbw;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Board {
	public enum Result {
		HIT, MISS, SUNK
	}

	List<ShipLocation> shipLocations = new ArrayList<ShipLocation>();

	Board(int size) {

	}

	public void addShipLocation(Set<Point> location) {
		// Validate that all points in the location are within board
		shipLocations.add(new ShipLocation(location));
	}

	public Result attack(Point location) {
		// Validate that the location is on the board
		for (ShipLocation shipLocation : shipLocations) {
			Board.Result result = shipLocation.attack(location);
			if (result == Board.Result.HIT || result == Board.Result.SUNK) {
				return result;
			}
		}
		return Result.MISS;
	}
}
