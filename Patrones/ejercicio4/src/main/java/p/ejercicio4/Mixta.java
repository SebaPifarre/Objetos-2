package p.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Mixta implements Topografia{
	List<Topografia> topografias;
	
	public Mixta(List<Topografia> topografias) {
		this.topografias = topografias;
	}
	
	public double proporcion() {
		return this.topografias.stream()
				.mapToDouble(t->t.proporcion())
				.sum() / 4;
	}
	
	public List<Double> estructura(){
		List<Double> l = new ArrayList<Double>();
		this.topografias.forEach(topo->l.addAll(topo.estructura()));
		return l;
	}
	
	public boolean equals(Topografia other) {
		return this.estructura().equals(other.estructura());
	}
}