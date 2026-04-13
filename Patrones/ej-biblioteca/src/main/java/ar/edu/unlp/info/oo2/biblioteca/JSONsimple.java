package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONsimple implements Exporter {
	
	@SuppressWarnings("unchecked")
	@Override
	public String exportar(List<Socio> socios) {
		JSONArray arreglo = new JSONArray();
		socios.forEach(s->arreglo.add(s.build()));
		return arreglo.toJSONString();
	}
	
	
}