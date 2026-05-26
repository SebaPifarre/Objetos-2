package p.ejercicio19;

public class DecoratorTamano extends Decorator {
	
	public DecoratorTamano(Archivo a) {
		this.archivo = a;
	}

	@Override
	public String getNombre() {
		return null;
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
		return this.archivo.prettyPrint() + " - " + this.getTamano();
	}
	
}