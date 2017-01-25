package org.foobarspam.Leap_Year.Year;

public class Year {
	private int year = 0;
	
	public Year(){
		
	}
	
	public Year(int year){
		this.year = year;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public boolean isLeapYear(){
		return ((getYear() % 4 == 0 && getYear() % 100 != 0) || getYear() % 400 == 0);
	}

}
