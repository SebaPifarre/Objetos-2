package p.ejercicio5;

public class Cliente {
	private TablaPeriodica tabla;
	
	public Cliente() {
		this.tabla = new TablaPeriodica();
	}
	
	public ElementoQuimico agua() {
		UnionQuimica union = new UnionQuimica();
		union.agregar(tabla.oxigeno());
		union.agregar(tabla.hidrogeno());
		union.agregar(tabla.hidrogeno());
		return union;
	}
}