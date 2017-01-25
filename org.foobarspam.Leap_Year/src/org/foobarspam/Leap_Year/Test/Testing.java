package org.foobarspam.Leap_Year.Test;

import org.foobarspam.Leap_Year.Year.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	// Tests with Leap Years
	@Test
	public void test_leap_zero() {
		Year year1940 = new Year(1940);
		Year year2080 = new Year(2080);
		assertTrue(year1940.isLeapYear());
		assertTrue(year2080.isLeapYear());

	}

	@Test
	public void test_leap_four() {
		Year year1944 = new Year(1944);
		Year year1904 = new Year(1904);
		assertTrue(year1944.isLeapYear());
		assertTrue(year1904.isLeapYear());
	}

	@Test
	public void test_leap_eight() {
		Year year2168 = new Year(2168);
		Year year1988 = new Year(1988);
		assertTrue(year2168.isLeapYear());
		assertTrue(year1988.isLeapYear());
	}

	@Test
	public void test_no_seculares() {
		Year year2400 = new Year(2400);
		assertTrue(year2400.isLeapYear());
		
	}

	// Tests with non Leap Years
	@Test
	public void test_seculares() {
		Year year2100 = new Year(2100);
		Year year1300 = new Year(1300);
		assertFalse(year2100.isLeapYear());
		assertFalse(year1300.isLeapYear());
	}
	
	@Test
	public void test_leap_five(){
		Year year1555 = new Year(1555);
		Year year2135 = new Year(2135);
		assertFalse(year1555.isLeapYear());
		assertFalse(year2135.isLeapYear());
	}
}
