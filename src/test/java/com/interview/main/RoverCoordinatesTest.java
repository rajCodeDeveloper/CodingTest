package com.interview.main;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.interview.pojo.RoverCoordinates;

public class RoverCoordinatesTest {

	@Test
	public void testGetRoverCoordinates() {
		/*int x =3;
		int y = 3;
		Character headedDirection = Direction.E.asChar();
		RoverCoordinates coordinates = new RoverCoordinates(x, y, headedDirection);
		
		String roverPattern ="MMRMMRMRRM";*/
		RoversPosition roversPosition= new RoversPosition();
		File file = new File("C:\\Users\\ab42278\\Desktop\\test.txt");
		try {
			roversPosition.startProcess(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//roversPosition.getRoverCoordinates(coordinates, roverPattern);
		/*assertEquals(coordinates.getxCoordinate(), 5);
		assertEquals(coordinates.getyCoordinate(), 1);
		assertEquals(coordinates.getHeadedDirection(), new Character(Direction.E.asChar()));*/
	}

}
