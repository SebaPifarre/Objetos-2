package p.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class UnionQuimica implements ElementoQuimico {
	private List<ElementoQuimico> elementos;
	
	public UnionQuimica() {
		this.elementos = new ArrayList<ElementoQuimico>();
	}
	
	public double pesoAtomico() {
		return this.elementos.stream().mapToDouble(e->e.pesoAtomico()).sum();
	}
	
	public double cargaElectrica() {
		return this.elementos.stream().mapToDouble(e->e.cargaElectrica()).sum();
	}
	
	public boolean esMetal() {
		// TODO
		return false;
	}
	
	public ElementoQuimico agregar(ElementoQuimico nuevo) {
		this.elementos.add(nuevo);
		return this;
	}
}