package p.ejercicio10;

public class Calculadora {
	private Estado estado;
	private double acc;
	
	public Calculadora() {
		this.acc =0;
		this.estado=new EsperandoValor(this);
	}
	
	protected void setEstado(Estado nuevo) {
		this.estado=nuevo;
	}
	
	protected void setAcc(double nuevo) {
		this.acc = nuevo;
	}
	
	public double getResultado() {
		return this.acc;
	}
	
	public void sumar() {
		this.estado.mas();
	}
	public void restar() {
		this.estado.menos();
	}
	public void multiplicar() {
		this.estado.por();
	}
	public void dividir()	{
		this.estado.dividir();
	}
	public void setValor(double valor) {
		this.estado.setValor(valor);
	}
	protected void setOperacion(Operacion o) {
		this.estado.setOperacion(o);
	}
}