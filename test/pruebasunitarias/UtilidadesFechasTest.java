package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class UtilidadesFechasTest {

	/**
	 * Método para comprobar que una lista de años pasados en un array son bisiestos
	 * Usa anotación @ValueSource para definir un array de enteros con los años que se prueban
	 * @param año  - entero obtenido del array
	 */
	@ParameterizedTest
	@DisplayName("Pasando lista de años bisiestos")
	@ValueSource(ints= {1984,1988,1992,2000,2004,2008,2020})
	
	void testEsAñoBisiesto( int año) {
		assertTrue(UtilidadesFechas.esAñoBisiesto(año));
	}
	
	/**
	 * Método para comprobar que una lista de años pasados en un array NO son bisiestos
	 * Usa anotación @ValueSource para definir un array de enteros con los años que se prueban
	 * @param año  - entero obtenido del array
	 */
	@ParameterizedTest
	@DisplayName("Pasando lista de años NO bisiestos")
	@ValueSource(ints= {1900, 1985, 1990, 2002,2021})
	
	void testNoEsAñoBisiesto( int año) {
		assertFalse(UtilidadesFechas.esAñoBisiesto(año));
	}
	
	/**
	 * Método para obtener una lista de años de prueba y el resultado esperado
	 *  Usa anotación @CsvFileSource para definir la ruta a un fichero CSV con los valores a probar
	 * @param año  - año , entero
	 * @param resultado- resultado esperado, booleano
	 */
	@ParameterizedTest
	@DisplayName("Obteniendo los años y resultado esperado de un fichero CSV")
	@CsvFileSource(resources="/pruebasunitarias/DatosPruebas.csv", numLinesToSkip=1)
	void testProbarBisiesto( int año, boolean resultado) {
		assertEquals(resultado, UtilidadesFechas.esAñoBisiesto(año));
	}

}
