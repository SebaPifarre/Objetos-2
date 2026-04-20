package p.ejercicio8;

public abstract class Estado {
	protected Item item;
	
	public Estado(Item item) {
		this.item = item;
	}
	
	public abstract void start();
	public abstract void togglePause();
	public abstract void finish();
	public abstract String estadoActual();
}