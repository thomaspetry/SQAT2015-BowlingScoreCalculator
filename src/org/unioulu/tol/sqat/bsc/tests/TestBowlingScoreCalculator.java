package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;


import org.junit.Test;
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

}
