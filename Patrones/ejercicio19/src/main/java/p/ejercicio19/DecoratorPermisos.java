package p.ejercicio19;

public class DecoratorPermisos extends Decorator {
	
	public DecoratorPermisos(Archivo a) {
		this.archivo = a;
	}

	@Override
	public String getNombre() {
		return this.archivo.getNombre();
	}

	@Override
	public String getTamano() {
		// TODO Auto-generated method stub
		return this.archivo.getTamano();
	}

	@Override
	public String getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.archivo.getFechaCreacion();
	}

	@Override
	public String getFechaModificacion() {
		// TODO Auto-generated method stub
		return this.archivo.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.archivo.getPermisos();
	}

	@Override
	public String prettyPrint() {
		return this.archivo.prettyPrint() + " - " + this.getPermisos();
	}
	
}