package p.ejercicio5;

public class TablaPeriodica {
	public ElementoQuimico oxigeno() {
		return new ElementoAtomico(16, -2, false, "Oxigeno");
	}
	
	public ElementoQuimico hidrogeno() {
		return new ElementoAtomico(1, 1, false, "Hidrogeno");
	}
	
	public ElementoQuimico cloro() {
		return new ElementoAtomico(35, -1, false, "Cloro");
	}
	
	public ElementoQuimico sodio() {
		return new ElementoAtomico(23, 1, true, "Sodio");
	}
	
	public ElementoQuimico calcio() {
		return new ElementoAtomico(40, 2, true, "Calcio");
	}
	
	
}