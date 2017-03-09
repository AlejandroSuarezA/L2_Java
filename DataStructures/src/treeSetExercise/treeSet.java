package treeSetExercise;

import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class treeSet {
	public static void crearTreeSet() {

		int numerosCantidad = 8;

		TreeSet<Integer> numeros = new TreeSet<Integer>();

		while (numeros.size() != numerosCantidad) {
			numeros.add(ThreadLocalRandom.current().nextInt(1, 11));
		}

		System.out.print(numeros.toString());
	}
	
	
	//Si, esta feo, pero queda claro
	public static void main (String[] args){
		crearTreeSet();
	}

}
