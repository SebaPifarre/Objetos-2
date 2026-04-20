package p.ejercicio8;

public class InProgress extends Estado {
	
	public InProgress(Item i) {
		super(i);
	}

	@Override
	public void start() {
		throw new RuntimeException("El objeto ToDoItem ya fue inicializado");
		
	}

	@Override
	public void togglePause() {
		this.item.cambiarEstado(new Paused(this.item));
		
	}

	@Override
	public void finish() {
		this.item.cambiarEstado(new Finished(this.item));
		
	}
	
	public String estadoActual() {
		return "In Progress";
	}
	
}