package com.bridgelab.moodanalyzer;

@SuppressWarnings("serial")
public class MoodAnalysisException extends Exception{

	public String message;

	public MoodAnalysisException(String message) {
		this.message = message;
	}
	

	
}
