package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	BowlingGame game = new BowlingGame();
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		if (isStrike() == true) 
			return firstThrow + bonus();
		else if (isSpare() == true)
			return firstThrow + secondThrow + bonus();
			return firstThrow + secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if (firstThrow == 10)
			return true;
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if (firstThrow + secondThrow == 10 && firstThrow != 10 && secondThrow !=10)
			return true;
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){	
		if (game.frames.size() == 9)
			return true;
		return false;
	}

	//bonus throws
	public int bonus(){
		return game.actualbonus;
	}
}
