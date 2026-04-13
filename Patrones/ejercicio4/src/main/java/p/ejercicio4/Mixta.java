package p.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Mixta implements Topografia{
	List<Topografia> topografias;
	
	public Mixta() {
		this.topografias = new ArrayList<Topografia>();
	}
	
	public double proporcion() {
		return this.topografias.stream()
				.mapToDouble(t->t.proporcion())
				.average().orElse(0);
	}
	
	public void add(Topografia t) {
		this.topografias.add(t);
	}
	
	public void remove(Topografia t) {
		this.topografias.remove(t);
	}
}