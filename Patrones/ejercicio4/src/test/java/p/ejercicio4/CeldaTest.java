package p.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class CeldaTest {
	
	Celda james, alice,sam;
	Mixta m,m2;
	Agua a,a2,a3;
	Tierra t,t2,t3,t4;
	List<Double> testList;
	
	@BeforeEach
	void setUp() throws Exception {
		
		
		List<Topografia> lista1 = new ArrayList<Topografia>();
		List<Topografia> lista2 = new ArrayList<Topografia>();
		
		a = new Agua();
		a2 = new Agua();
		a3 = new Agua();
		
		
		t = new Tierra();
		t2 = new Tierra();
		t3 = new Tierra();
		t4 = new Tierra();
		
		lista1.add(a2);
		lista1.add(t);
		lista1.add(t2);
		lista1.add(a3);
		
		
		m = new Mixta(lista1);
		
		lista2.add(a);
		lista2.add(m);
		lista2.add(t3);
		lista2.add(t4);
		
		
		m2 = new Mixta(lista2);
		
		james = new Celda(m2);
		alice = new Celda(m2);
		
		
		List<Topografia> lista3 = new ArrayList<Topografia>();
		lista3.add(new Agua());
		lista3.add(new Agua());
		lista3.add(new Pantano());
		lista3.add(new Tierra());
		sam = new Celda(new Mixta(lista3));
		
		testList = new ArrayList<Double>();
		
		testList.add(1.0);
		testList.add(1.0);
		testList.add(0.0);
		testList.add(0.0);
		testList.add(1.0);
		testList.add(0.0);
		testList.add(0.0);
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals(james.proporcion(), 0.375);
        
        assertTrue(james.estructura().equals(alice.estructura()));
        
        assertEquals(sam.proporcion(), 0.675);
    }
}
