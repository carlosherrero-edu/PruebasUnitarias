package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PuntoTest {
	
	static Punto punto1, punto2;
	final double ERROR= 0.001;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//creo los elementos que necesito 
		punto1 = new Punto();
		 punto2= new Punto(1.0, 2.0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		//libero los elementos que ya no necesito
		punto1 = null;
		punto2 = null;
	}
	
	@BeforeEach
	void restaurarPunto1() {
		//restablezco las propiedades de Punto1 antes de cada prueba
		punto1.setCoordX(0.0);
		punto1.setCoordY(0.0);
	}
	

	@Test
	@DisplayName("Probando constructor vacío")
	void testPunto() {
		assertNotNull(punto1);
		assertEquals(0.0,punto1.getCoordX());
		assertEquals(0.0,punto1.getCoordY());
	}

	@Test
	@DisplayName("Probando constructor con argumentos")
	void testPuntoConParametros() {
		assertNotNull(punto2);
		assertEquals(1.0,punto2.getCoordX());
		assertEquals(2.0,punto2.getCoordY());
	}

	@Test
	@DisplayName("Probando set de la coordenada X")
	void testSetCoordX() {
		double otraX=10.0;
		punto1.setCoordX(otraX);
		assertEquals( otraX,punto1.getCoordX());
	}

	@Test
	@DisplayName("Probando set de la coordenada Y")
	void testSetCoordY() {
		double otraY=15.0;
		punto1.setCoordY(otraY);
		assertEquals( otraY,punto1.getCoordY());
	}

	@Test
	@DisplayName("Probando infoPunto")
	void testInfoPunto() {
		String miX= String.format("%.2f", punto1.getCoordX());
		String miY= String.format("%.2f", punto1.getCoordX());
		assertTrue (punto1.infoPunto().indexOf(miX)>0);
		assertTrue (punto1.infoPunto().indexOf(miY)>0);

	}

	@Test
	@DisplayName("Probando cálculo de distancia")
	void testCalcularDistancia() {
		assertEquals( 5.0 ,  punto1.calcularDistancia(3.0, 4.0),ERROR);
	}

}
