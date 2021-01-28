package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversoresTemperaturasTest {

	final double ERROR=0.001;

	@Test
	void testConversorTemperaturask() {
		
		
		
		assertEquals(32.0, ConversoresTemperaturas.conversorTemperaturas(0,'c'), ERROR);
		assertEquals(32.0, ConversoresTemperaturas.conversorTemperaturas(0,'C'),ERROR);
	}
	
	@Test
	void testConversorTemperaturasf() {
		
		
		assertEquals(100.0, ConversoresTemperaturas.conversorTemperaturas(212.0, 'f'), ERROR);
		assertEquals(100.0, ConversoresTemperaturas.conversorTemperaturas(212.0, 'F'), ERROR);
	}

}
