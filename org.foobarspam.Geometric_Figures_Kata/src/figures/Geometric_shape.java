package figures;

public abstract class Geometric_shape {
	
	private String name;
	
	//Empty constructor, 
	public Geometric_shape(){
		this.name = "Unknown";
	}
	
	//Constructor who gets only one argument
	public Geometric_shape(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public abstract double area();

}
