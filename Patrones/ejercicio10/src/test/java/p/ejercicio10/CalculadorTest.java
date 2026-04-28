package p.ejercicio10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class CalculadorTest {
	
	Calculadora james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Calculadora();

		james.setValor(20);
		james.sumar();
		james.setValor(15);
		
		
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals(james.getResultado(), 35);
        james.dividir();
		james.setValor(5);
		assertEquals(james.getResultado(), 7);
    }
}
