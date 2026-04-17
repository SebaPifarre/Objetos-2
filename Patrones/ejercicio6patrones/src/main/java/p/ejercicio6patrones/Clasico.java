package p.ejercicio6patrones;

public class Clasico {
	private String pan;
	private String aderezo;
	private String principal;
	private String adicional;
	private double precio=0;
	
	
	public void agregarPan() {
		this.pan = "Brioche";
		this.precio += 100;
	};
	public void agregarAderezo() {
		this.aderezo = "Mayonesa";
		this.precio += 20;
	}
	public void agregarPrincipal() {
		this.principal = "Ternera";
		this.precio += 300;
	}
	public void agregarAdicional() {
		this.adicional = "Tomate";
		this.precio += 80;
	}
	
	public Sandwich armar() {
		return new Sandwich(this.pan, this.aderezo, this.principal, this.adicional, this.precio);
	}
}