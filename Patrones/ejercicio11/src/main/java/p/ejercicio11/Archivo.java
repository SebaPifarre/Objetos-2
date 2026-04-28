package p.ejercicio11;

public class Archivo extends Componente {
	private int tamano;
	
	public Archivo(String nombre, String fecha, int tamano) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamano = tamano;
	}

	@Override
	void agregar(Componente nuevo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	int getTamano() {
		return this.tamano;
	}
}