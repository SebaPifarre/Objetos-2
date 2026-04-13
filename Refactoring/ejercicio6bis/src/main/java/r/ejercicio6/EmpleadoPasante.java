package r.ejercicio6;

public class EmpleadoPasante extends Empleado {

	
	public EmpleadoPasante(String nombre, String apellido, double sueldoBasico) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.sueldoBasico=sueldoBasico;
	}
	
	public double sueldo() {
		return this.sueldoBasico - this.recorte();
	}
}