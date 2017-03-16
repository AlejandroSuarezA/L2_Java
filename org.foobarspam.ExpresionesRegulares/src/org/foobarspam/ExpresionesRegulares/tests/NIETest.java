package org.foobarspam.ExpresionesRegulares.tests;

import org.foobarspam.ExpresionesRegulares.validador.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class NIETest {

	String nieValido = "X1234567E";
	
	
	@Test
	public void NieValido() {
		
		assertTrue(Validador.nie(nieValido));
		
	}
	
	@Test
	public void NieValidoConLector(){
		assertTrue(Validador.leerDocumento(nieValido));
	}

}
