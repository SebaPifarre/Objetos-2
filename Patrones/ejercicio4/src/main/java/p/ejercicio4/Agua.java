package p.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Agua implements Topografia{
	
	public Agua() {
	}
	
	public double proporcion() {
		return 1.0;
	}
	
	public List<Double> estructura(){
		List<Double> l = new ArrayList<Double>();
		l.add(this.proporcion());
		return l;
	}
	
	public boolean equals(Topografia other) {
		return this.estructura().equals(other.estructura());
	}
}