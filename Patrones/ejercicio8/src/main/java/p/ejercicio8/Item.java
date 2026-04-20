package p.ejercicio8;

public class Item {
	private Estado state;
	private String nombre;
	
	
	public Item(String nombre) {
		this.nombre = nombre;
		this.state = new Pending(this);
	}
	
	public void start() {
		this.state.start();
	}
	
	public void togglePause() {
		this.state.togglePause();
	}
	
	public void finish() {
		this.state.finish();
	}
	
	public void cambiarEstado(Estado e) {
		this.state=e;
	}
	
	public String estadoActual() {
		return this.state.estadoActual();
	}
	
	public Estado getState() {
		return this.state;
	}
	
}