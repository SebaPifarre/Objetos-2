package p.ejercicio4;

import java.util.List;

public class Celda{
	private Topografia celda;
	
	public Celda(Topografia t) {
		this.celda = t;
	}
	
	public double proporcion() {
		return this.celda.proporcion();
	}
	public boolean equals(Topografia other) {
		return this.estructura().equals(other.estructura());
	}
	public List<Double> estructura(){
		return celda.estructura();
	}
}