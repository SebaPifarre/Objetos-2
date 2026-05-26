package p.ejercicio19;

public class ConcreteArchivo implements Archivo {
	private String nombre;
	private String tamano;
	private String fechaCreacion;
	private String fechaModificacion;
	private String permisos;
	
	public ConcreteArchivo(String nombre, String tamano, String fechaCreacion, String fechaModificacion, String permisos) {
		this.nombre=nombre;
		this.tamano=tamano;
		this.fechaCreacion=fechaCreacion;
		this.fechaModificacion=fechaModificacion;
		this.permisos=permisos;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String getTamano() {
		return this.tamano;
	}

	@Override
	public String getFechaCreacion() {
		return this.fechaCreacion;
	}

	@Override
	public String getFechaModificacion() {
		return this.fechaModificacion;
	}

	@Override
	public String getPermisos() {
		return this.permisos;
	}
	
	public String prettyPrint() {
		return this.getNombre();
	}
}