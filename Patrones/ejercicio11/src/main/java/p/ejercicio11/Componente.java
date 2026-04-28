package p.ejercicio11;

import java.util.List;

public abstract class Componente {
	protected String nombre;
	protected String fecha;
	protected List<Componente> componentes;
	
	abstract void agregar(Componente nuevo);
	abstract int getTamano();
}