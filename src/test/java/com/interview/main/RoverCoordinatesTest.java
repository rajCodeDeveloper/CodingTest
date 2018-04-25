package com.interview.main;

import static org.junit.Assert.*;

import org.junit.Test;

import com.interview.pojo.RoverCoordinates;

public class RoverCoordinatesTest {

	@Test
	public void testGetRoverCoordinates() {
		int x =3;
		int y = 3;
		Character headedDirection = Direction.E.asChar();
		RoverCoordinates coordinates = new RoverCoordinates(x, y, headedDirection);
		
		String roverPattern ="MMRMMRMRRM";
		RoversPosition roversPosition= new RoversPosition();
		roversPosition.getRoverCoordinates(coordinates, roverPattern);
		assertEquals(coordinates.getxCoordinate(), 5);
		assertEquals(coordinates.getyCoordinate(), 1);
		assertEquals(coordinates.getHeadedDirection(), new Character(Direction.E.asChar()));
	}

}
