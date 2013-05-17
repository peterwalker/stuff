package com.pbw;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Board {
	public enum Result {
		HIT, MISS, SUNK
	}

	int size;
	List<ShipLocation> shipLocations = new ArrayList<ShipLocation>();

	Board(int size) {
		this.size = size;
	}

	public void addShipLocation(Set<Point> location) throws BattleShipException {
		// Validate that all points in the location are within board
		for (Point point : location) {
			validatePointIsOnBoard(point);
		}
		shipLocations.add(new ShipLocation(location));
	}

	private void validatePointIsOnBoard(Point point) throws BattleShipException {
		if (point.x > size || point.y > size) {
			throw new BattleShipException("Point is not on the board");
		}
	}

	public Result attack(Point point) throws BattleShipException {
		validatePointIsOnBoard(point);
		// Validate that the location is on the board
		for (ShipLocation shipLocation : shipLocations) {
			Board.Result result = shipLocation.attack(point);
			if (result == Board.Result.HIT || result == Board.Result.SUNK) {
				return result;
			}
		}
		return Result.MISS;
	}
}
