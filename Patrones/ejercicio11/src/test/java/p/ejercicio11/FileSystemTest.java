package p.ejercicio11;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class FileSystemTest {
	
	FileSystem james;
	Archivo arch1, arch2;
	Carpeta carp1, root;
	
	@BeforeEach
	void setUp() throws Exception {
		
		
		arch1 = new Archivo("archivo1", "ahora", 10);
		arch2 = new Archivo("archivo2", "despues", 15);
		
		carp1 = new Carpeta("carpeta1", "mañana");
		
		carp1.agregar(arch2);
		
		root = new Carpeta("root", "ab");
		
		root.agregar(arch1);
		root.agregar(carp1);
		
		james = new FileSystem(root);
		
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals(james.tamanoTotalOcupado(), 89);
    }
}
