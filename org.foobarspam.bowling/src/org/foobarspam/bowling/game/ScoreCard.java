package org.foobarspam.bowling.game;

public class ScoreCard {
	// properties
	private String scoreCard = "";
	private int totalScore = 0;
	final static String symbols = "-123456789X/";
	private Boolean firstRoll = true;
	private Boolean spare = false;

	private int previousRoll = 0;

	// constructor
	public ScoreCard(String pins) {
		this.setScoreCard(pins);
	}

	// Sets & Gets
	public void setScoreCard(String pins) {
		this.scoreCard = pins;
	}

	public String getScoreCard() {
		return this.scoreCard;
	}

	public String getSymbol() {
		return symbols;
	}

	public int getTotalScore() {
		return this.totalScore;
	}

	public void setTotalScore(int score) {
		this.totalScore = score;
	}

	public void setFirstRoll(Boolean status) {
		this.firstRoll = status;
	}

	public void setSpare(Boolean status) {
		this.spare = status;
	}

	public Boolean getFirstRoll() {
		return this.firstRoll;
	}

	public Boolean getSpare() {
		return this.spare;
	}

	public static int getSimbolValue(char symbol) {
		return symbols.indexOf(symbol);
	}

	public void setPreviousRoll(int pins) {
		this.previousRoll = pins;
	}

	public int getPreviousRoll() {
		return this.previousRoll;
	}

	// Methods
	public void roll(char pin) {

		int spareValue = 11;
		int sparePoints = 10;
		
		int score = getSimbolValue(pin);

		if (getFirstRoll() == true) {
			// first roll
			// int score = getSimbolValue(pin);
			// setTotalScore(getTotalScore() + score);
			setPreviousRoll(score);
			setFirstRoll(false);
			if(getSpare()){
				setTotalScore(getTotalScore() + score);
			}
		}

		else if (score == spareValue) {
			// not first roll
			setTotalScore(getTotalScore() + 10);
			setSpare(true);
			setFirstRoll(true);
		}

		else {
			// spare
			setTotalScore(getTotalScore() + score + getPreviousRoll());
			setFirstRoll(true);
			setSpare(false);
		}

	}

}
