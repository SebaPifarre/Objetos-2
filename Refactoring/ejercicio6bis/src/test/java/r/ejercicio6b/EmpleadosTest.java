package r.ejercicio6b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import r.ejercicio6.EmpleadoPasante;
import r.ejercicio6.EmpleadoPlanta;
import r.ejercicio6.EmpleadoTemporario;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class EmpleadosTest {
	
	EmpleadoPlanta james;
	EmpleadoTemporario laura;
	EmpleadoPasante sam;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new EmpleadoPlanta("James", "A", 1000, 2);
		laura = new EmpleadoTemporario("laura", "B", 9000, 200, 0);
		sam = new EmpleadoPasante("sam", "C", 10000);
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals(4870, james.sueldo());
        assertEquals(107830, laura.sueldo());
        assertEquals(8700, sam.sueldo());
    }
}
