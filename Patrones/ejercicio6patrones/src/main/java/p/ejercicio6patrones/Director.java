package p.ejercicio6patrones;

public class Director {
	public Sandwich armar(Builder b) {
		Sandwich sand = b.empezarSandwich();
		
		return sand;
	}
	
}