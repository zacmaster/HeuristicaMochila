package prueba;

import java.util.ArrayList;

public class Elementos {
	ArrayList<Elemento> elementos = null;
	Elementos(){
		elementos = new ArrayList<Elemento>();
	}
	public void agregarElemento(Elemento elemento){
		elementos.add(elemento);
	}
	public int cantidad(){
		return elementos.size();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ \n");
		for (Elemento elemento : elementos) {
			sb.append(elemento.nombre+": ");
			sb.append(quitarDecimal(elemento.peso)+", ");
			sb.append(quitarDecimal(elemento.beneficio)+", ");
			sb.append(elemento.cociente+". \n");
		}
		sb.append("]");
		return sb.toString();
	}
	public String quitarDecimal(double numero){
		String cadena = numero +"";
		if(numero%1 == 0)cadena = (int) numero + "";
		return cadena;
	}
	public void ordenarPorPeso(){
		
	}
	public void ordenarPorBeneficio(){
		
	}
	public void ordenarPorCociente(){
		
	}
	
	
}
