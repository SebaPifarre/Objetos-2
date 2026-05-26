package p.ejercicio19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class ArchivoTest {
	
	Archivo james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new ConcreteArchivo("mi nombre", "16 bytes", "una fecha", "otra fecha", "777");
		james = new DecoratorTamano(james);
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals(james.prettyPrint(), "mi nombre - 16 bytes");
        james = new DecoratorPermisos(james);
        assertEquals(james.prettyPrint(), "mi nombre - 16 bytes - 777");
    }
}
