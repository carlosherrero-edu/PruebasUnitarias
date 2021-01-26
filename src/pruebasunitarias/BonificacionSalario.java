package pruebasunitarias;

public class BonificacionSalario {
	
	/**
	 * Método para calcular el salario bonificado que se percibe según el importe de un salario inicial
	 * corresponde a ejercicio 10 de la colección 3
	 * @param salarioInicial importe del salario antes de aplicar la bonificación
	 * @return importe del salario una vez aplicada la bonificación
	 */
	/**
	 * @param salarioInicial
	 * @return
	 */
	public static double calcularSalarioBonificado(double salarioInicial ) {
		//solución de Jonnhie Herrera
		double bonificacion ;
        
        if (salarioInicial <= 1000) {
            bonificacion = 1.2;
        }
        else if (salarioInicial <= 1800) {
            bonificacion = 1.15;
        }
        else {
            bonificacion = 1.10;
        }
        
        double salarioFinal = (salarioInicial*bonificacion);
        return (salarioFinal);
}

}
