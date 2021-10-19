package com.bridgelab.moodanalyzer;

public class MoodAnalyser {
	
	public String message;
	
	public MoodAnalyser() {
		
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}
	

	public String analyseMood() {
		try {
			if(message.contains("I'm in sad"))
			return "SAD";
			else
				return "HAPPY";
		}
		catch(NullPointerException e) {
			return "HAPPY";
		}
	}
	
	public String analyseMood(String message) throws MoodAnalysisException {
		this.message = message;
		return analyseMood();
	}
	
	
	public String analyseMoodException() throws MoodAnalysisException {
		try {
			if(message.contains("I'm in sad"))
			return "SAD";
			else
				return "HAPPY";
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException("PLEASE ENTER  VALID MESSAGE");
		}
	}
	
	
	
	public static void main(String[] args) {
		//UC1
		MoodAnalyser moodAnalayer = new MoodAnalyser("im happy");
		System.out.println(moodAnalayer.analyseMood());
	}
}
