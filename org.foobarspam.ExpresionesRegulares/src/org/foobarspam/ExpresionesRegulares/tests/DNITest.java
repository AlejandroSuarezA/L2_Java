package org.foobarspam.ExpresionesRegulares.tests;

import org.foobarspam.ExpresionesRegulares.validador.*;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class DNITest {

	String[] DniCorrecto = { "78484464T", "72376173A", "01817200Q", "95882054E", "63587725Q",

			"26861694V", "21616083Q", "26868974Y", "40135330P", "89044648X" };

	@Test
	public void DNIcorrectos() {

		assertTrue(Validador.dni(DniCorrecto[0]));

		assertTrue(Validador.dni(DniCorrecto[1]));

		assertTrue(Validador.dni(DniCorrecto[2]));

		assertTrue(Validador.dni(DniCorrecto[3]));

		assertTrue(Validador.dni(DniCorrecto[4]));

		assertTrue(Validador.dni(DniCorrecto[5]));

		assertTrue(Validador.dni(DniCorrecto[6]));

		assertTrue(Validador.dni(DniCorrecto[7]));

		assertTrue(Validador.dni(DniCorrecto[8]));

		assertTrue(Validador.dni(DniCorrecto[9]));

	}

	@Test
	public void DniIncorrecto() {

	}

}
