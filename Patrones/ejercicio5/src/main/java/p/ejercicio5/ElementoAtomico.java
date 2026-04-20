package p.ejercicio5;

public class ElementoAtomico implements ElementoQuimico{
	private double pesoAtomico;
	private double cargaElectrica;
	private boolean esMetal;
	private String nombre;
	
	public ElementoAtomico(double pesoAtomico, double cargaElectrica, boolean esMetal, String nombre) {
		this.pesoAtomico = pesoAtomico;
		this.cargaElectrica = cargaElectrica;
		this.esMetal = esMetal;
		this.nombre = nombre;
	}
	
	public double pesoAtomico() {
		return this.pesoAtomico;
	}
	public double cargaElectrica() {
		return this.cargaElectrica;
	}
	public boolean esMetal() {
		return this.esMetal;
	}
	
	public ElementoQuimico agregar(ElementoQuimico nuevo) {
		UnionQuimica union = new UnionQuimica();
		union.agregar(this);
		union.agregar(nuevo);
		return union;
	}
}