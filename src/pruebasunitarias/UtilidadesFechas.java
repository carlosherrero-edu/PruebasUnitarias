package pruebasunitarias;

/**
 * Utilidades para los ejercicios de la Colección 4. Clase compuesta de
 * funciones - métodos estáticos- que se invocarán desde otras clases
 * 
 * @author Carlos Herrero
 * @version 27-dic-2020
 */

public class UtilidadesFechas {

	/**
	 * Función que determina si un año es o no bisiesto corresponde a ejercicio 20
	 * de la colección 3
	 * 
	 * @param año valor del año que comprobamos
	 * @return true si el año es bisiesto, false en caso contrario
	 */
	public static boolean esAñoBisiesto(int año) {

		boolean resultado = false;

		if (año % 400 == 0) {
			resultado = true;

		} else {
			if (año % 4 == 0 && año % 100 != 0) {
				resultado = true;
			}
		}
		// en cualquier otro caso, no es bisiesto
		return resultado;
	}

	/**
	 * Función para la validación de una fecha de la que se pasan el año, mes y día
	 * Es solución del ejercicio 3.3. de la colección 4
	 * 
	 * @param año Valor del año, que debe estar comprendido entre 1 y 9999
	 * @param mes entero con el valor del mes, que debe estar comprendido entre 1 y
	 *            12
	 * @param dia entero con el valor del día, entre 1 y el último día del mes
	 * @return true si la fecha existe y es váida, false en otro caso
	 * @see UtilidadesFechas.esAñoBisiesto
	 */
	public static boolean validarFecha(int año, int mes, int dia) {

		boolean esValida = false;
		int diaMaximo;

		if (año > 0 && año <= 9999) { // valido el año
			// si el año es válido, comprobamos el mes
			if (mes >= 1 && mes <= 12) { // valido el mes
				// si el año y mes son válidos, determinamos el último día del mes
				diaMaximo = switch (mes) {
				case 4, 6, 9, 11 -> {
					yield 30;
				}

				case 2 -> {
					// tratamiento específico para el mes de febrero
					if (UtilidadesFechas.esAñoBisiesto(año)) {
						{
							yield 29;
						}

					} else {
						{
							yield 28;
						}
					}
				}

				default -> {
					yield 31;
				}

				}; // fin del switch
				if (dia >= 1 && dia <= diaMaximo) {
					// si llego hasta aquí, la fecha es válida
					esValida = true;
				}
			}
		}
		// en cualquier otro caso, la fecha no es válida

		return esValida;
	}

}
