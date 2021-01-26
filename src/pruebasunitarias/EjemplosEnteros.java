package pruebasunitarias;

public class EjemplosEnteros {
	
	/**
	 * Función que determina si un número entero es par o impar
	 * Corresponde a solución del ejercicio 6 de la colección 3
	 * @param numero valor entero
	 * @return cadena que indica si es par o impar
	 */
	public static String dimeParidad ( int numero  ) {
		
		String resultado;
		
		if (numero % 2 == 0) {
			resultado = "PAR";
		} else {
			resultado = "IMPAR";
		}
		return resultado;		
		
	}
	
	/**
	 * Función que calcula el factorial de un número entero
	 * Corresponde a la solución del Ejercicio 3.4 de la colección 4
	 * @param num entero del que queremos calcular el factorial, suponemos que no negativo
	 * @return entero largo con el valor del factorial del número
	 */
	public static long calcularFactorial (int num) {
		
		long producto = 1L; //acumulador para el producto de los números sucesivos
		
		if (num >0) {
			for (int i=1; i<=num; i++) {
				producto *= i;
			}
		} //en otro caso, devolverá 1
		
		return producto;
	}
	
	

}
