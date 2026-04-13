package p.ejercicio4;

public class Celda{
	private Topografia celda;
	
	public Celda(Topografia t) {
		this.celda = t;
	}
	
	public double proporcion() {
		return this.celda.proporcion();
	}
}