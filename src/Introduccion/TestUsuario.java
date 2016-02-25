package Introduccion;

import java.util.List;
import java.util.ArrayList;


public class TestUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Usuario> usuariosValidos= new ArrayList<Usuario>();
		while(usuariosValidos.size()!=5){
			String login=Usuario.generarLoginOPassword();
			String password=Usuario.generarLoginOPassword();
		try{
			Usuario u= new Usuario (login, password);
			usuariosValidos.add(u);
		}catch (UsuarioException e){
			System.out.println("Login no correcto: "+login);
			}
		
		}
		System.out.println(usuariosValidos);
		System.out.println("Nº objetos creados: "+Usuario.getNumeroUsuarios());
	}
		
}


