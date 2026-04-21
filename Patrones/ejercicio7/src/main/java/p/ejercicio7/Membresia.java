package p.ejercicio7;

public abstract class Membresia {
	protected double tasa;
	protected int plazoMinimo;
	protected int parking;
	
	public Membresia() {
		
	}
	
	public ProductoFinanciero crearProducto3(String fecha) {
		ProductoCombinado combinado = new ProductoCombinado(fecha);
		combinado.agregarProducto(new CompraBonoAltoRiesgo(fecha, this.parking));
		combinado.agregarProducto(new CompraBonoBajoRiesgo(fecha, this.parking));
		return combinado.agregarProducto(new PlazoFijo(fecha, this.plazoMinimo, this.tasa));
		
	}
	public ProductoFinanciero crearProducto4(String fecha) {
		ProductoCombinado combinado = new ProductoCombinado(fecha);
		
		combinado.agregarProducto(new CompraBonoAltoRiesgo(fecha, this.parking));
		combinado.agregarProducto(new CompraBonoAltoRiesgo(fecha, this.parking));
		return combinado.agregarProducto(new CompraBonoAltoRiesgo(fecha, this.parking));
		
	}
}