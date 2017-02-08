package BiciPalma;

public class TarjetaUsuario {
	private String id = "000000000";
	private Boolean activada = true;
	
	public TarjetaUsuario(String id, Boolean estado){
		this.id = id;
		this.activada = estado;
	}
	
	public void setActivada(){
		if(this.activada == true){
			this.activada = false;
		}
		
		else{
			this.activada = true;
		}
	}
	
	public Boolean isActivada(){
		return this.activada;
	}

}
