package p.ejercicio8;

public class Pending extends Estado{
	
	
	public Pending(Item i) {
		super(i);
	}
	
	public void start() {
		this.item.cambiarEstado(new InProgress(this.item));
	}
	
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public void finish() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public String estadoActual() {
		return "Pendiente";
	}

}