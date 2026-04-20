package p.ejercicio5;


public interface ElementoQuimico{
	public double pesoAtomico();
	public double cargaElectrica();
	public boolean esMetal();
	public ElementoQuimico agregar(ElementoQuimico nuevo);
}