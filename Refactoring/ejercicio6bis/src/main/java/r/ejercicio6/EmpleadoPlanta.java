package r.ejercicio6;

public class EmpleadoPlanta extends Empleado {
	private int cantidadHijos;
	
	
	public EmpleadoPlanta(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.sueldoBasico=sueldoBasico;
		this.cantidadHijos=cantidadHijos;
	}
	
	public double sueldo() {
		return this.sueldoBasico
				+ (this.cantidadHijos * 2000)
				- this.recorte();
	}
	
}