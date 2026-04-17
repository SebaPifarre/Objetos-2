package p.ejercicio6patrones;



public class Sandwich {
	private String pan;
	private String aderezo;
	private String principal;
	private String adicional;
	private double precio;
	
	public Sandwich(String pan, String aderezo, String principal, String adicional, double precio) {
		this.pan = pan;
		this.aderezo = aderezo;
		this.principal = principal;
		this.adicional = adicional;
		this.precio = precio;
	}
	
	public String getPan() {
		return pan;
	}
	
	public String getAderezo() {
		return aderezo;
	}
	
	public String getPrincipal() {
		return principal;
	}

	public String getAdicional() {
		return adicional;
	}
	
	public double getPrecio() {
		return this.precio;
	}

}