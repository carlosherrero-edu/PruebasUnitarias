package pruebasunitarias;

public class ConversoresTemperaturas {
	
	/**
	 * Conversor de temperaturas entre las escalas Celsius y Faretheim
	 * corresponde a ejercicio 8 de la colección 3
	 * @param temperatura valor de la temperatura de entrada, a convertir
	 * @param escala carácter que indica la escala de la temperatura de entrada: 'C' /'F'
	 * @return valor de la temperatura en la otra escala
	 */
	public static double conversorTemperaturas (double temperatura, char escala ) {
		//solución de Miguel Rodríguez
		double tempFinal = 0;
        
        if (escala == 'C' || escala == 'c' ) {
            tempFinal = 32 + 9 * (temperatura / 5);
        }
        else if(escala == 'F'|| escala == 'f' ) {
            tempFinal = (temperatura - 32) * 5 / 9;
        }
        
        return tempFinal;
	}

}
