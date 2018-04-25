package com.interview.main;

public enum Direction {
    E('E'),W('W'),N('N'),S('S'),L('L'),R('R'),M('M');


	    public char asChar() {
	        return asChar;
	    }

	    private final char asChar;

	    private Direction(char asChar) {
	        this.asChar = asChar;
	    }
	
}
