package p.ejercicio6patrones;

public class Clasico {
	public Brioche agregarPan() {
		return new Brioche();
	};
	public Mayonesa agregarAderezo() {
		return new Mayonesa();
	}
	public Ternera agregarPrincipal() {
		return new Ternera();
	}
	public Tomate agregarAdicional() {
		return new Tomate();
	}
}