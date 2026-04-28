package p.ejercicio11;

import java.util.ArrayList;

public class Carpeta extends Componente {
	
	public Carpeta(String nombre, String fecha) {
		this.nombre=nombre;
		this.fecha=fecha;
		this.componentes = new ArrayList<Componente>();
	}

	@Override
	void agregar(Componente nuevo) {
		this.componentes.add(nuevo);
		
	}

	@Override
	int getTamano() {
		return 32 + this.componentes.stream()
						.mapToInt(c->c.getTamano())
						.sum();
		
	}
	
	
}