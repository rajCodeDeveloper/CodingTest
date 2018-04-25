package com.interview.pojo;

public class RoverCoordinates {
	private int xCoordinate;
	private int yCoordinate;
	private Character headedDirection;
	
	
	public RoverCoordinates(int xCoordinate,int yCoordinate,Character headedDirection){
		this.xCoordinate =xCoordinate;
		this.yCoordinate =yCoordinate;
		this.headedDirection =headedDirection;
	}


	public int getxCoordinate() {
		return xCoordinate;
	}


	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	
	public String toString(){
		return  Integer.toString(xCoordinate)+"   "+  Integer.toString(yCoordinate)+"   "+headedDirection;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}


	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}


	public Character getHeadedDirection() {
		return headedDirection;
	}


	public void setHeadedDirection(Character headedDirection) {
		this.headedDirection = headedDirection;
	}
	
	
	
	
	

}
