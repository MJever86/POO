package Introduccion;

public class Usuario {
	private String login;
	private String password;
	private static int numeroUsuarios=0;
	
	/**
	 * @param login
	 * @param password
	 * @throws UsuarioException 
	 */
	public Usuario(String login, String password) throws UsuarioException {
		if (validarUsuario(login)){
		this.login = login;
		this.password = password;
		numeroUsuarios++;
		}
		else
			throw new UsuarioException();
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	
	/**
	 * @return the numeroUsuarios
	 */
	public static int getNumeroUsuarios() {
		return numeroUsuarios;
	}
	/**
	 * @param numeroUsuarios the numeroUsuarios to set
	 */
	public static void setNumeroUsuarios(int numeroUsuarios) {
		Usuario.numeroUsuarios = numeroUsuarios;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	private static boolean validarUsuario(String login){
		return login.matches("[a-zA-z].*");
	}
	public static String generarLoginOPassword(){
		final String FUENTE_CARACTERES= "aAbBcCdDeEfFgGhHiIjJkKlLm"
				+ "MnNnNoOpPqQrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&{}";
		final int tamanoMaximo=22;
		String usuario="";
		int tamano=(int)(Math.random()*(tamanoMaximo+1));
		for (int i = 0; i < tamano; i++) {
			int elegirCaracter=(int)(Math.random()*FUENTE_CARACTERES.length());
			usuario+=FUENTE_CARACTERES.charAt(elegirCaracter);
		}
		return usuario;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", password=" + password + "]";
	}
	public static void main(String[] args) {
		//probamos el metodo que me da el usuario
		for (int i = 0; i < 20; i++) {
			System.out.println(generarLoginOPassword());
			
		}
	}
}
class UsuarioException extends Exception{
	
}