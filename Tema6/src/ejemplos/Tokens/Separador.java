package ejemplos.Tokens;

import java.util.StringTokenizer;

public class Separador {

	public static void main(String[] args) {
		
		//STRINGTOKENIZER
		String csv = "Javier;Guillen Benavente;Profesor;Mojácar;33";
		StringTokenizer st = new StringTokenizer(csv, ";");
		while( st.hasMoreElements() ) {
			System.out.println( st.nextToken() );
		}
		
		//SPLIT
		String[] tokens = csv.split(";");
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		//Generar objeto desde un string con separador
		Persona per1 = new Persona(tokens[0], tokens[1], tokens[2], tokens[3], Integer.parseInt(tokens[4]) );
		System.out.println(per1);
	}
}