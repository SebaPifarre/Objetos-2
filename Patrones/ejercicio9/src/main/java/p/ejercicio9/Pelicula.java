package p.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int estreno;
	private double puntaje;
	private List<Pelicula> similares;
	private Recomendacion recomendacion;
	
	public Pelicula(String titulo, int estreno, double puntaje) {
		this.titulo = titulo;
		this.estreno = estreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}
}