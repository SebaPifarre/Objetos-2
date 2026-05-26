package p.ejercicio19;

public abstract class Decorator implements Archivo {
	protected Archivo archivo;
	
	public abstract String prettyPrint();
}