package org.foobarspam.ExpresionesRegulares.validador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
	
	static private String regExDni = "\\b\\d{8}[A-Z&&[^IÑOU]]\\b";
	
	static Pattern formatoDni = Pattern.compile(regExDni);
	
	public static boolean dni(String dni){
		 Matcher verificador = formatoDni.matcher(dni);
		 return verificador.find();
	}
	
}
