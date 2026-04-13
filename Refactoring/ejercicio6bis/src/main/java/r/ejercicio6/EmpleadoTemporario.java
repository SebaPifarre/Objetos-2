package r.ejercicio6;

public class EmpleadoTemporario extends Empleado {
	public double horasTrabajadas;
	public int cantidadHijos;
	
	public EmpleadoTemporario(String nombre, String apellido, double sueldoBasico, double horasTrabajadas, int cantidadHijos) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.sueldoBasico=sueldoBasico;
		this.horasTrabajadas=horasTrabajadas;
		this.cantidadHijos=cantidadHijos;
	}
	
	public double sueldo() {
		return this.sueldoBasico
				+ (this.horasTrabajadas * 500)
				+ (this.cantidadHijos * 1000)
				- this.recorte();
	}
}