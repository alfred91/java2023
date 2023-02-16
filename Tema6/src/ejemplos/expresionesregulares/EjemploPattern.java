package ejemplos.expresionesregulares;
import java.util.regex.*;
public class EjemploPattern {

	public static void main(String[] args) {

		String csv="Javier;Guillen;Benavente;Profesor;Mojacar";
		Pattern pt1=Pattern.compile(";");
		
	//De comprobar que coincide con la expresión
		
		System.out.println( pt1.matches ("[a-zA-Z;]*",csv) );
		
	//Cuenta el número de veces que encuentra el pattern pt1 en csv
		
		Matcher mc = pt1.matcher(csv);
		int cont=0;
		while (mc.find()) {
			cont++;
		}
		System.out.println(cont);
		
		//Sustituye todas las apariciones del pt1 por el caracter indicado
		System.out.println(mc.replaceAll(","));
		
		//Comprobar que una expresion regular coincide en un string dado
		Pattern pat=Pattern.compile("^abc.*");
		Matcher mat = pat.matcher("aabc");
		if (mat.matches()) {
			System.out.println("Correcto");
		} else {
			System.out.println("No cumple");
		}
		//Sustituir en un string una expresion
		Pattern pt2 = Pattern.compile("Java");
		Matcher mt2 = pt2.matcher("El lenguaje Java, no tiene que ver con la isla de Java,"
				+ " pero me gusta programar en Java");
		StringBuilder sb = new StringBuilder();
		while(mt2.find()) {
			mt2.appendReplacement(sb, "Python");
		}
		mt2.appendTail(sb);
		System.out.println(sb.toString());
		
	}
}