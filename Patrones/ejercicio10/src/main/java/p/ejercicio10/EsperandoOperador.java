package p.ejercicio10;

public class EsperandoOperador extends Estado {

	public EsperandoOperador(Calculadora calc) {
		super(calc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getResultado() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void borrar() {
		this.calc.setAcc(0);
		this.calc.setEstado(new EsperandoValor(this.calc));
		
	}

	@Override
	public void setValor(double unValor) {
		this.calc.setEstado(new EstadoError(this.calc));
		this.calc.setEstado(new EsperandoValor(this.calc));
	}

	@Override
	public void mas() {
		this.calc.setEstado(new EsperandoValor(this.calc));
		this.calc.setOperacion(new Sumar());
	}

	@Override
	public void menos() {
		this.calc.setEstado(new EsperandoValor(this.calc));
		this.calc.setOperacion(new Restar());
	}

	@Override
	public void por() {
		this.calc.setEstado(new EsperandoValor(this.calc));
		this.calc.setOperacion(new Multiplicar());
	}

	@Override
	public void dividir() {
		this.calc.setEstado(new EsperandoValor(this.calc));
		this.calc.setOperacion(new Dividir());
		
	}
	
}