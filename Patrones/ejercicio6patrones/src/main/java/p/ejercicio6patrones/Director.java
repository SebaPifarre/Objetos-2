package p.ejercicio6patrones;

public class Director {
	public Sandwich sandwich(Builder b) {
		b.agregarPan();
		b.agregarAderezo();
		b.agregarPrincipal();
		b.agregarAdicional();
		return b.armar();
	}
	
}