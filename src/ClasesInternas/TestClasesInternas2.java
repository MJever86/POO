package ClasesInternas;

import ClasesInternas.Externa.Interna;

public class TestClasesInternas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Externa1.Interna1 in=new Externa1.Interna1();
		System.out.println(in.getterVariableClase());
	}

}
class Externa1{
	private int variableInstancia =5;
	private static int variableClase=6;
	public static class Interna1{
		/*public int getterVariableInstancia(){
			return variableInstancia;
		}No se puede acceder a un estatico desde un NO estatico
		*/
		public int getterVariableClase(){
			return variableClase;
		}
	}
}
