package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EjemplosEnterosTest {
	
	String valorObtenido;
	int entrada;
	final String RES1="PAR";
	final String RES2="IMPAR";
	long resultado;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Comienzo la clase de prueba");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Finalizado la clase de prueba");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inicio un nuevo caso de prueba");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Finalizo el  caso de prueba");
	}

	@Test
	void testDimeParidad1() {
		System.out.println("Caso 1: Número par");
		entrada=100;
		valorObtenido= EjemplosEnteros.dimeParidad(entrada);
		assertTrue( valorObtenido.equals(RES1));
	}
	
	@Test
	void testDimeParidad2() {
		System.out.println("Caso 2: Número impar");
		entrada=101;
		valorObtenido= EjemplosEnteros.dimeParidad(entrada);
		//assertEquals(RES2,valorObtenido);
		assertTrue( valorObtenido.equals(RES2));
	}
	
	@Test
	void testCalcularFactorial1() {
		//probamos el caso en que le pasamos 0
		resultado=EjemplosEnteros.calcularFactorial(0);		
		assertEquals(1,resultado);
		
	}
	
	@Test
	void testCalcularFactorial2() {
		//probamos el caso en que le pasamos >0
		resultado= EjemplosEnteros.calcularFactorial(1);
		assertEquals(1,resultado);
		resultado= EjemplosEnteros.calcularFactorial(5);
		assertEquals(120,resultado);
		
	}

}
