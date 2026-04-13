package p.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class CeldaTest {
	
	Celda james;
	Mixta m,m2;
	Agua a,a2;
	Tierra t,t2;
	
	@BeforeEach
	void setUp() throws Exception {
		m = new Mixta();
		m2 = new Mixta();
		
		
		a = new Agua();
		a2 = new Agua();
		
		
		t = new Tierra();
		t2 = new Tierra();
		
		m2.add(a2);
		m2.add(t);
		m2.add(t2);
		
		
		m.add(a);
		m.add(m2);
		
		
		james = new Celda(m);
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals(james.proporcion(), 0.5);
    }
}
