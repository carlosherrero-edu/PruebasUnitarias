package pruebasunitarias;

public class ContarCifras {

	/**
	 * Función que cuenta el número de cifras de un número entero
	 * 
	 * @param n valor del entero, suponemos que inferior en valor absoluto a 10^9
	 * @return número de cifras del número Corresponde a Ejercicio 4 de la Colección
	 *         5
	 */
	public static int contarCifras(int n) {

		int num_cifras = 0;
		// si el número es negativo, lo pasamos a valor positivo
		if (n < 0) {
			n = (-1) * n;
		}

		while (n > 0) {
			num_cifras++;
			n = n / 10; // hacemos la división entera entre 10 en cada paso
		}

		return num_cifras;

	}

}
