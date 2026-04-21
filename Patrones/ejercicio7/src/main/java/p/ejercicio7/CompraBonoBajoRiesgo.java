package p.ejercicio7;

public class CompraBonoBajoRiesgo extends ProductoFinanciero {
	private int parking;
	
	public CompraBonoBajoRiesgo(String fecha, int parking) {
		this.fechaOperacion = fecha;
		this.parking = parking;
	}

	@Override
	double retornoInversion(double montoInicial) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	ProductoFinanciero agregarProducto(ProductoFinanciero nuevo) {
		ProductoCombinado combinado = new ProductoCombinado(this.fechaOperacion);
		combinado.agregarProducto(this);
		combinado.agregarProducto(nuevo);
		return combinado;
	}
}