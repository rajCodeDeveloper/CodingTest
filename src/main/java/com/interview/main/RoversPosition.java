package com.interview.main;

import com.interview.pojo.RoverCoordinates;

public class RoversPosition {

	public static void main(String[] args) {
		
		
		
		
	
		
		

	}
	
	public RoverCoordinates getRoverCoordinates(RoverCoordinates coordinates, String roverPattern){
		RoversPosition roversPosition= new RoversPosition();
		for(int i=0;i<roverPattern.length();i++){
			coordinates = roversPosition.getRoverCoordinatesBasedOnPattern(roverPattern.charAt(i),coordinates);
		}	
		return coordinates;
	}
	
	public  RoverCoordinates getRoverCoordinatesBasedOnPattern(Character patternChar,RoverCoordinates coordinates){
		
	
		if(patternChar==Direction.L.asChar()){
			if(coordinates.getHeadedDirection()==Direction.E.asChar()){
				coordinates.setHeadedDirection(Direction.N.asChar());
			}else if(coordinates.getHeadedDirection()==Direction.W.asChar()){
				coordinates.setHeadedDirection(Direction.S.asChar());
			}else if(coordinates.getHeadedDirection()==Direction.N.asChar()){
				coordinates.setHeadedDirection(Direction.W.asChar());
			}else if(coordinates.getHeadedDirection()==Direction.S.asChar()){
				coordinates.setHeadedDirection(Direction.E.asChar());
			}
		}else if(patternChar==Direction.R.asChar()){
			if(coordinates.getHeadedDirection()==Direction.E.asChar()){
				coordinates.setHeadedDirection(Direction.S.asChar());
			}else if(coordinates.getHeadedDirection()==Direction.W.asChar()){
				coordinates.setHeadedDirection(Direction.N.asChar());
			}else if(coordinates.getHeadedDirection()==Direction.N.asChar()){
				coordinates.setHeadedDirection(Direction.E.asChar());
			}else if(coordinates.getHeadedDirection()==Direction.S.asChar()){
				coordinates.setHeadedDirection(Direction.W.asChar());
			}
		}else if(patternChar==Direction.M.asChar()){
			if(coordinates.getHeadedDirection()==Direction.E.asChar()){
				coordinates.setxCoordinate(coordinates.getxCoordinate() +1);
			}else if(coordinates.getHeadedDirection()==Direction.W.asChar()){
				coordinates.setxCoordinate(coordinates.getxCoordinate() -1);
			}else if(coordinates.getHeadedDirection()==Direction.N.asChar()){
				coordinates.setyCoordinate(coordinates.getyCoordinate() +1);
			}else if(coordinates.getHeadedDirection()==Direction.S.asChar()){
				coordinates.setyCoordinate(coordinates.getyCoordinate() -1);
			}
		}
		
		return coordinates;
		
	}

}
