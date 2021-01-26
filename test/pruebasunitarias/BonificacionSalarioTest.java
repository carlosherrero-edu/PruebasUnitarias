package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BonificacionSalarioTest {

	double salario;
	double salario_final;
	final double ERROR=0.005;
	
	@Test
	void testCalcularSalarioBonificado1() {
		salario = 1000;
		System.out.println("Caso 1: salario = 800");
		salario_final = BonificacionSalario.calcularSalarioBonificado(salario);
		assertEquals(1200, salario_final,ERROR);
		
	}
	@Test
	void testCalcularSalarioBonificado2() {
		salario = 1800;
		System.out.println("Caso 1: salario = 1200");
		salario_final = BonificacionSalario.calcularSalarioBonificado(salario);
		assertEquals(2070, salario_final,ERROR);
	}
	
	@Test
	void testCalcularSalarioBonificado3() {
		salario = 1801;
		System.out.println("Caso 1: salario = 2000");
		salario_final = BonificacionSalario.calcularSalarioBonificado(salario);
		assertEquals(1981.1, salario_final, ERROR);
	}

}
