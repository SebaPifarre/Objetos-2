package ejercicios.refact;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class RingTest {
	
	IntRing anillo1;
	
	CharRing anillo2;
	
	@BeforeEach
	void setUp() throws Exception {
		Integer[] numeros = {1,2,3,4};
		anillo1 = new IntRing(numeros);
		
		anillo2 = new CharRing("hola");
		
		anillo1.next();
		anillo1.next();
		anillo2.next();
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals(3, anillo1.next());
        assertEquals('o', anillo2.next());
    }
}