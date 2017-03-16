package org.foobarspam.ExpresionesRegulares.validador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.experimental.theories.Theories;

public class Validador {

	static private int longitudDni = 9;
	
	static private String regExDni = "\\b\\d{8}[A-Z&&[^IÑOU]]\\b";
	static private String regexNie = "\\b[XYZ]\\d{7}[A-Z&&[^IÑOU]]\\b";

	static Pattern formatoDni = Pattern.compile(regExDni);
	static Pattern formatoNie = Pattern.compile(regexNie);

	public static boolean dni(String dni) {
		Matcher verificador = formatoDni.matcher(dni);
		return verificador.find();
	}

	public static boolean nie(String nie) {
		Matcher verificador = formatoNie.matcher(nie);
		return verificador.find();
	}


}
