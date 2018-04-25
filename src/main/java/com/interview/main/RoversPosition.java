package com.interview.main;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

import com.interview.pojo.RoverCoordinates;

public class RoversPosition {

	public void startProcess(File file) throws IOException{
		String maxCoordinates=null;
		BufferedReader br=null;
		if(file.exists()){
				br= new BufferedReader(new FileReader(file));
				if(br!=null){
				 String content =  br.readLine();
				 maxCoordinates = content;
				 while(content!=null){
					 content = br.readLine();
					 if(content!=null){
						 String[] str =content.split(" ");
						 int x =Integer.parseInt(str[0]);
						 int y=Integer.parseInt(str[1]);
						 Character direction =str[2].charAt(0);
						 RoverCoordinates coordinates = new RoverCoordinates(x,y,direction);
						 String pattern  = br.readLine();
						 coordinates = getRoverCoordinates(coordinates,pattern);
					 }
					
				 }
			}
		
		}
	}
	public RoverCoordinates getRoverCoordinates(RoverCoordinates coordinates, String roverPattern){
		RoversPosition roversPosition= new RoversPosition();
		for(int i=0;i<roverPattern.length();i++){
			coordinates = roversPosition.getRoverCoordinatesBasedOnPattern(roverPattern.charAt(i),coordinates);
		}	
		System.out.println(coordinates);
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
