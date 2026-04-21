package p.ejercicio7;

public class MembresiaSilver extends Membresia{
	public MembresiaSilver() {
		this.tasa = 5;
		this.plazoMinimo = 35;
		this.parking = 72;
	}

	public ProductoFinanciero crearProducto1(String fecha, double valorDolares, double valorPesos) {
		ProductoCombinado combinado = new ProductoCombinado(fecha);
		combinado.agregarProducto(new CompraDolares(fecha, valorDolares));
		combinado.agregarProducto(new PlazoFijo(fecha, this.plazoMinimo, this.tasa));
		return combinado.agregarProducto(new CompraPesos(fecha, valorPesos));
	}
	
	public ProductoFinanciero crearProducto2(String fecha, double valorDolares, double valorPesos) {
		ProductoCombinado combinado = new ProductoCombinado(fecha);
		combinado.agregarProducto(new CompraBonoBajoRiesgo(fecha, this.parking));
		combinado.agregarProducto(new CompraDolares(fecha, valorDolares));
		combinado.agregarProducto(new PlazoFijo(fecha, this.plazoMinimo, this.tasa));
		return combinado.agregarProducto(new CompraPesos(fecha, valorPesos));
	}
	
}