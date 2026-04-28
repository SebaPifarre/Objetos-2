package p.ejercicio10;

public class EsperandoValor extends Estado {

	public EsperandoValor(Calculadora calc) {
		super(calc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getResultado() {
		// TODO Auto-generated method stub
		return this.calc.getResultado();
	}

	@Override
	public void borrar() {
		this.calc.setAcc(0);
		
	}

	@Override
	public void setValor(double unValor) {
		this.calc.setAcc(this.operacion.resolver(this.calc.getResultado(), unValor));
		this.calc.setEstado(new EsperandoOperador(this.calc));
	}

	@Override
	public void mas() {
		this.calc.setEstado(new EstadoError(this.calc));
		
	}

	@Override
	public void menos() {
		this.calc.setEstado(new EstadoError(this.calc));
		
	}

	@Override
	public void por() {
		this.calc.setEstado(new EstadoError(this.calc));
		
	}

	@Override
	public void dividir() {
		this.calc.setEstado(new EstadoError(this.calc));
		
	}
	
}