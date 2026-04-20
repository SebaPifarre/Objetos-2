package p.ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class ItemTest {
	
	Item james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Item("Compras");
		guido = new Item("Cocinar");
		
		james.start();
		
		guido.start();
		guido.togglePause();
		
		
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals("In Progress", james.estadoActual());
        assertEquals(new InProgress(new Item("test")).getClass(), james.getState().getClass());
        
        RuntimeException ex = assertThrows(RuntimeException.class, james::start);
        assertEquals("El objeto ToDoItem ya fue inicializado", ex.getMessage());
        
        assertEquals("Pausado", guido.estadoActual());
    }
}
