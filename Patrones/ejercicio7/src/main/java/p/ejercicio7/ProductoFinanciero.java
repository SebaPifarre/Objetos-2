package p.ejercicio7;

public abstract class ProductoFinanciero {
	protected String fechaOperacion;
	
	public ProductoFinanciero() {
		
	}
	
	abstract double retornoInversion(double montoInicial);
	abstract ProductoFinanciero agregarProducto(ProductoFinanciero nuevo);
}