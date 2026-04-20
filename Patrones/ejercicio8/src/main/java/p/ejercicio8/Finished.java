package p.ejercicio8;

public class Finished extends Estado {
	
	public Finished(Item i) {
		super(i);
	}

	@Override
	public void start() {
		throw new RuntimeException("El objeto ToDoItem se encuentra finalizado");
		
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem se encuentra finalizado");
		
	}

	@Override
	public void finish() {
		throw new RuntimeException("El objeto ToDoItem se encuentra finalizado");
	}
	
	public String estadoActual() {
		return "Terminado";
	}
	
}