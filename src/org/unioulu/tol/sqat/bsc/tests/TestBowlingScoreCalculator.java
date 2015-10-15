package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;


import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {
	

	@Test
	public void testScore4And5Returns9() {
		Frame frame = new Frame(5, 4);
		int score = frame.score();
		assertEquals(9,score);
	}
	
	@Test
	public void testScoreOfStrike() {
		Frame frame = new Frame(10, 0);
		int score = frame.score();
		assertEquals(10,score);
	}
	
	@Test
	public void testScoreOfSpare() {
		Frame frame = new Frame(6, 4);
		int score = frame.score();
		assertEquals(10,score);
	}
	
	@Test
	public void testScoreOfAllFrames() {
		BowlingGame game = new BowlingGame();
		Frame frame1 = new Frame(5, 4);
		game.addFrame(frame1);
		Frame frame2 = new Frame(2, 3);
		game.addFrame(frame2);
		int score = game.score();
		assertEquals(14,score);
	}
	
	@Test
	public void testScoreOfAllFramesWithSpare() {
		BowlingGame game = new BowlingGame();
		Frame frame1 = new Frame(2, 3);
		game.addFrame(frame1);
		game.setBonus(2, 3);
		Frame frame2 = new Frame(6, 4);
		game.addFrame(frame2);
		game.setBonus(6, 4);
		Frame frame3 = new Frame(2, 3);
		game.addFrame(frame3);
		game.setBonus(2, 3);
		int score = game.score();
		assertEquals(22,score);
	}
	
	@Test
	public void testBonusCalculate() {
		BowlingGame game = new BowlingGame();
		Frame frame = new Frame(6, 4);
		game.addFrame(frame);
		game.setBonus(2, 3);
		assertEquals(2, game.actualbonus);
	}

}
