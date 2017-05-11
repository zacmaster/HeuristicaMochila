package prueba;

public class Main {
	public static void main(String[] args) {
		Elemento a = new Elemento("a",5,6);
		Elemento b = new Elemento("b",6,5);
		Elemento c = new Elemento("c",7,8);
		Elemento d = new Elemento("d",20,11);
		Elemento e = new Elemento("e",22,11);
		Elemento f = new Elemento("f",1,0.5);
		Elemento g = new Elemento("g",2,0.5);
		Elementos mochila = new Elementos();
		mochila.agregarElemento(a);
		mochila.agregarElemento(b);
		mochila.agregarElemento(c);
		mochila.agregarElemento(d);
		mochila.agregarElemento(e);
		mochila.agregarElemento(f);
		mochila.agregarElemento(g);
		System.out.println(mochila);
	}

}
