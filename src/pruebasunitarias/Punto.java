package pruebasunitarias;

public class Punto {
	
	//constantes finales con las coordenadas del punto origen
	private final double ORIGEN_X = 0.0;
	private final double ORIGEN_Y = 0.0;
	
	//propiedades, que serán las coordenadas del punto
	private double coordX;
	private double coordY;
	
	// constructor sin parámetros
	public Punto(){
		this.coordX= ORIGEN_X;
		this.coordY= ORIGEN_Y;
		
	}
	
	//constructor con parámetros
	public Punto(double x, double y){
		coordX= x;
		coordY= y;
	}

	//métodos getXxx y setXxx
	public double getCoordX() {
		return coordX;
	}

	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}

	public double getCoordY() {
		return coordY;
	}

	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}
	 // método para devolver en un solo string las coordenadas del punto
	public void infoPunto(){
		System.out.format("%n Punto ( Posición X  : %.2f,  Posición Y:  %.2f)",
				this.coordX, this.coordY);
	}
	
	//método para calcular la distancia a otro punto
	public double calcularDistancia (double otroX, double otroY){
		
		return Math.sqrt(Math.pow(this.getCoordX()-otroX, 2)+Math.pow(this.getCoordY()- otroY, 2));
	}
	
} // fin de la clase
