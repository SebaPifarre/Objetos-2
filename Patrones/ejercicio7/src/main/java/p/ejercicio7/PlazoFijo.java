package p.ejercicio7;

public class PlazoFijo extends ProductoFinanciero {
	private int cantidadDias;
	private double interes;
	
	public PlazoFijo(String fecha, int cantidadDias, double interes) {
		this.fechaOperacion = fecha;
		this.cantidadDias = cantidadDias;
		this.interes = interes;
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