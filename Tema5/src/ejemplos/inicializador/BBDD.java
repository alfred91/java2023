package ejemplos.inicializador;

public class BBDD {
	
	private static String bbdd;
	private static String usuario;
	private static String password;
	
	private String consulta;
	
	//Esto se ejecuta antes de crear ningún objeto
	static {
		//Lo ideal es que esto saliera de un fichero
		BBDD.bbdd = "empleados";
		BBDD.usuario = "usuario";
		BBDD.password = "12345678";
	}
	
	public BBDD(String unaConsulta) {		
		this.consulta = BBDD.usuario + "@" + BBDD.password + "/" + "127.0.0.1/"+ BBDD.bbdd + " / " + unaConsulta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BBDD [consulta=");
		builder.append(consulta);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
