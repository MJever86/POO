package ClasesInternas;

public class TestClasesInternas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Externa2 e=new Externa2();
		int [] coelccion=e.metodo();
		for (int i : coelccion) {
			System.out.println(i);
		}
	}

}
class Externa2{
	private int variableInstanciaExterna=2;
	public int[] metodo(){
		int[] valoresADevolver=new int[2];
		class Interna2{
			private int variableInstanciaInterna=3;
			
		}
		Interna2 in=new Interna2();
		valoresADevolver[0]=variableInstanciaExterna;
		valoresADevolver[1]=in.variableInstanciaInterna;
		return valoresADevolver;
	}
}