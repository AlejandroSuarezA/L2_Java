package org.foobarspam.bowlinggame.test;

import org.foobarspam.bowlinggame.game.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThrowTest {

	@Test
	public void test() {
		tiradaEsperada = 1;
		Throwing frameOne = new Throwing();
		frameOne.setThrowOne(1);
		frameOne.setThrowTwo(1);
		
		assertThat(frameOne.getThrowOne() instanceof Integer);
		
	}

}
