package org.foobarspam.bowlinggame.game;

public class Throwing {
	//Properties
	private int throwOne = 0;
	private int throwTwo = 0;
	
	//Constructor
	public Throwing(){
		
	}
		
	//Set & Get
	public void setThrowOne(int pins){
		this.throwOne = pins;
	}
	
	public void setThrowTwo(int pins){
		this.throwTwo = pins;
	}
	
	public int getThrowOne(){
		return this.throwOne;
	}
	
	public int getThrowTwo(){
		return this.throwTwo;
	}
	
}
