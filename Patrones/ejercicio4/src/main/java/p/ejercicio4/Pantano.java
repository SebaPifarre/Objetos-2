package p.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Pantano implements Topografia {

	public double proporcion() {
		// TODO Auto-generated method stub
		return 0.7;
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