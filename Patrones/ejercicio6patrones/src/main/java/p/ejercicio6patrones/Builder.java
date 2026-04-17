package p.ejercicio6patrones;

public interface Builder {
	public Sandwich armar();
	public String agregarPan();
	public String agregarAderezo();
	public String agregarPrincipal();
	public String agregarAdicional();
}