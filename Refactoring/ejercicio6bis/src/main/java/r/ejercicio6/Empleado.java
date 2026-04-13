package r.ejercicio6;

public abstract class Empleado {
	protected String nombre;
	protected String apellido;
	protected double sueldoBasico;
	
	public Empleado() {
		
	}
	public abstract double sueldo();
	protected double recorte() {
		return this.sueldoBasico * 0.13;
	}
}