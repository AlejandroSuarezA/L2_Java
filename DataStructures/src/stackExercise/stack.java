package stackExercise;

import java.util.Stack;

public class stack {
	
	public static void girarCadena(String cadena){
		
		Stack<Character> cadenaInversa = new Stack<Character>();
		
		for(int i = 0; i < cadena.length(); i++){
			cadenaInversa.push(cadena.charAt(i));
		}
		
		
		while(!cadenaInversa.isEmpty()){
			System.out.print(cadenaInversa.pop());
		}
	}

	
	public static void main (String[] args){
		girarCadena("\nHola que tal");
		girarCadena("Soy fenomenal");
	}
}
