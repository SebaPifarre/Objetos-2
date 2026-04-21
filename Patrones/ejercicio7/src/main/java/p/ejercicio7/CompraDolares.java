package p.ejercicio7;

public class CompraDolares extends ProductoFinanciero {
	private double valorCompra;
	
	public CompraDolares(String fecha, double valor) {
		this.valorCompra = valor;
		this.fechaOperacion = fecha;
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