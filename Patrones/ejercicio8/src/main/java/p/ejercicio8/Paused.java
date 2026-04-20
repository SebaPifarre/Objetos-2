package p.ejercicio8;

public class Paused extends Estado {
	
	public Paused(Item i) {
		super(i);
	}

	@Override
	public void start() {
		throw new RuntimeException("El objeto ToDoItem ya se encuentra inicializado");
		
	}

	@Override
	public void togglePause() {
		this.item.cambiarEstado(new InProgress(this.item));
		
	}

	@Override
	public void finish() {
		this.item.cambiarEstado(new Finished(this.item));
		
	}
	
	public String estadoActual() {
		return "Pausado";
	}
	
}