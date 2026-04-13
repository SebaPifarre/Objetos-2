package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class BibliotecaTest {
	
	Socio james,laura,sam;
	Biblioteca biblio,biblio2;
	VoorheesExporter expor;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Socio("James", "A", "JamesA@");
		biblio = new Biblioteca();
		biblio2 = new Biblioteca();
		expor = new VoorheesExporter();
		
		biblio.setExporter(expor);
		biblio.agregarSocio(james);
		
		JSONsimple js = new JSONsimple();
		biblio2.setExporter(js);
		biblio2.agregarSocio(james);
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals(biblio.exportarSocios(), biblio2.exportarSocios() );
    }
}