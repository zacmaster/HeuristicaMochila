package prueba;

public class Elemento {
	protected String nombre;
	protected double peso;
	protected double beneficio;
	protected double cociente;
	public Elemento(String nombre, double peso, double beneficio) {
		this.nombre = nombre;
		this.peso = peso;
		this.beneficio = beneficio;
		this.cociente = beneficio/peso;
	}
	
	

}
