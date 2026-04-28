package p.ejercicio10;

public class EstadoError extends Estado {

	public EstadoError(Calculadora calc) {
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
		this.calc.setEstado(new EsperandoValor(this.calc));
		this.calc.setAcc(0);
		
	}

	@Override
	public void setValor(double unValor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void por() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dividir() {
		// TODO Auto-generated method stub
		
	}
	
}