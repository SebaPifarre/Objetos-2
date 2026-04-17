package p.ejercicio6patrones;

public class Cliente {
	private Director dir;
	private Builder build;
	
	public Cliente(Director dir) {
		this.dir = dir;
	}
	
	public void setDirector(Director dir) {
		this.dir = dir;
	}
	
	public Sandwich getSandwich() {
		return this.dir.sandwich(this.build);
	}
}