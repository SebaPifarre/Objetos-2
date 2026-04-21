package p.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class ProductoCombinado extends ProductoFinanciero {
	private List<ProductoFinanciero> productos;
	
	public ProductoCombinado(String fecha) {
		this.productos = new ArrayList<ProductoFinanciero>();
		this.fechaOperacion = fecha;
	}

	@Override
	double retornoInversion(double montoInicial) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	ProductoFinanciero agregarProducto(ProductoFinanciero nuevo) {
		this.productos.add(nuevo);
		return this;
	}
	
	
}