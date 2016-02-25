package ejerciciosPOOII;

public class Rectangulo {
	//atributos
	private double ancho=1;
	private double alto=1;
	private static int numeroRectangulos=0;
	
	public Rectangulo(){
		this.ancho=ancho;
		this.alto=alto;
		numeroRectangulos++;
	}
	
	/**
	 * @param ancho
	 * @param alto
	 */
	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
		numeroRectangulos++;
	}
	/**
	 * @return the numeroRectangulos
	 */
	public static int getNumeroRectangulos() {
		return numeroRectangulos;
	}

	/**
	 * @param numeroRectangulos the numeroRectangulos to set
	 */
	public static void setNumeroRectangulos(int numeroRectangulos) {
		Rectangulo.numeroRectangulos = numeroRectangulos;
	}

	public double obtenerArea(){
		double ancho=this.ancho;
		double alto=this.alto;
		
		return ancho*alto;
	}
	public double obtenerPerimetro(){
		double ancho=this.ancho;
		double alto=this.alto;
		return 2*(ancho+alto);
	}

	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(double alto) {
		this.alto = alto;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + ", obtenerArea()=" + obtenerArea()
				+ ", obtenerPerimetro()=" + obtenerPerimetro() + "]";
	}
	public static void main (String[] args){
		for(int i=0;i<5;i++){
			Rectangulo r=new Rectangulo();
			System.out.println(r);
		}
		System.out.println("numero de rectangulos: "+numeroRectangulos);
	}
}

