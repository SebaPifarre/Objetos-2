package p.ejercicio10;

public abstract class Estado{
	protected Calculadora calc;
	protected Operacion operacion;
	
	public Estado(Calculadora calc) {
		this.calc=calc;
		this.operacion = new Sumar();
	}
	
	public abstract double getResultado();
	
	public abstract void borrar();
	
	public abstract void setValor(double unValor);
	
	public abstract void mas();
	
	public abstract void menos();
	
	public abstract void por();
	
	public abstract void dividir();
	
	protected void setOperacion(Operacion o) {
		this.operacion = o;
	}
}