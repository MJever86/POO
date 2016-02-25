package Introduccion;

public class TestValorReferencia {
	static int a=5;
	static int b=10;	
	public static void mains (String[] args) {
		Persona p= new Persona("maria", 29);
		System.out.println("antes de llamar cambiarObjetos: "+p);
		cambiarObjetos (p);
		System.out.println("despues de llamar cambiarObjetos: "+p);
		System.out.println(".................");
		
		System.out.printf("%s, %d, %d%n","Antes de llamar al metodo cambiar", a, b);
		cambiarTiposPrimitivos(a, b);
		System.out.printf("%s, %d, %d%n","Despues del metodo cambiar", a, b);

	}
	public static void cambiarObjetos(Persona p1){
		p1.setNombre("pepa");
		p1.setEdad("25");
		System.out.println("Dentro del método cambiar "+p1);
	}
	public static void cambiarTiposPrimitivos(int a, int b){
		int aux=a;
		a=b;
		b=aux;
		System.out.printf("%s, %d, %d%n","Dentro del metodo cambiar", a, b);
		
	}


}
