package com.bridgelab.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalayerTest {
	//UC1
	@Test
	public void AbilityToAnalyseAndResponseHappyOrSadMood(){
		MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in happy mood.");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	//UC2
	@Test
	public void givenNullShouldReturnHappy(){
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	//UC3
	@Test
	public void informIfUserEnteredInvalidMood() throws MoodAnalysisException{
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = null;
		@SuppressWarnings("deprecation")
		ExpectedException exceptionRule = ExpectedException.none();
		exceptionRule.expect(MoodAnalysisException.class);
		mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	@Test
	public void givenNullMoodShouldThrowException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood(null);
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("PLEASE ENTER VALID MESSAGE", e.getMessage());
		}
	}
}
