package BiciPalma;


import java.util.concurrent.ThreadLocalRandom;
public class Estacion {
	// propiedades
	private int id = 0;
	private String direccion = "";
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes = null;

	// constructores
	public Estacion(int id, String direccion, int anclaje) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = anclaje;
		this.anclajes = new Bicicleta[anclaje];
	}

	public void consultarEstacion() {
		// Devuelve el estado de la estacion, el id, direccion y anclaje
		System.out.println(getId() + "" + getDireccion() + "" + getAnclajesTotales());
	}

	// Definimos los metodos que necesitamos para consultar estacion
	public int getId() {
		return this.id;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public int getAnclajesTotales() {
		return this.numeroAnclajes;
	}

	public Bicicleta[] getAnclajes() {
		return this.anclajes;
	}
	
	public Bicicleta getAnclaje(int anclaje){
		return this.anclajes[anclaje];
	}

	

	// Definimos el metodo que muestra cuantos anclajes libres hay
	public int anclajesLibres() {
		int libres = 0;
		for (int i = 0; i < getAnclajes().length; i++) {
			if (anclajes[i] == null) {
				libres += 1;
			}
		}
		return libres;
	}

	public void anclarBicicleta(Bicicleta bicicleta) {

		for (int i = 0; i < getAnclajes().length; i++) {
			if (getAnclaje(i) == null) {
				getAnclajes()[i] = bicicleta;
				mostrarAnclaje(bicicleta, i);
				break;
			}
		}

	}

	public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {

		System.out.println(bicicleta.getId() + " " + numeroAnclaje);
	}

	public void consultarAnclajes() {
		for (int i = 0; i < getAnclajes().length; i++) {
			if (getAnclajes()[i] != null) {
				mostrarAnclaje(getAnclajes()[i], i);
			} else {
				System.out.println("Empty");
			}

		}
	}

	public Boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
		return tarjetaUsuario.isActivada();
	}

	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
		if (tarjetaUsuario.isActivada() != false) {
			int anclajeAleatorio = generarAnclaje();
			
				mostrarBicicleta(getAnclajes()[anclajeAleatorio], anclajeAleatorio);
				getAnclajes()[anclajeAleatorio] = null;
			}
			

		}

	

	public int generarAnclaje() {
		int anclaje = ThreadLocalRandom.current().nextInt(getAnclajes().length-1);
		while(getAnclajes()[anclaje] == null){
			anclaje = ThreadLocalRandom.current().nextInt(getAnclajes().length-1);
		}
		return anclaje;
	}

	public void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje) {
		System.out.println(bicicleta.getId() + " " + numeroAnclaje);

	}

}
