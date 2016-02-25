package ejerciciosPOOII;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1= new Rectangulo();
		System.out.println(r1);
		System.out.println("El área es: "+r1.obtenerArea());
		System.out.println("El perimetro es: "+r1.obtenerPerimetro());
		Rectangulo r2= new Rectangulo(4,6);
		System.out.println(r2);
		System.out.println("El área es: "+r2.obtenerArea());
		System.out.println("El perimetro es: "+r2.obtenerPerimetro());
		Rectangulo r3= new Rectangulo(9,12);
		System.out.println(r3);
		System.out.println("El área es: "+r3.obtenerArea());
		System.out.println("El perimetro es: "+r3.obtenerPerimetro());
		
	}

}
