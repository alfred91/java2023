package ahorcado;
import java.util.*;

public class Main {
	
		static String damePalabraSecreta() {
			
			String [] palabras = {"casa","perro","coche"};
				Random r=new Random();
					int n= r.nextInt(palabras.length);
					
						return palabras[n];
		}
		
	static char[] dameGuionesDePalabra(String palabra) {

		int nLetrasPalabraSecreta= palabra.length();

		char[] palabraGuiones= new char [nLetrasPalabraSecreta];

	for (int i=0;i<palabraGuiones.length;i++) {
		palabraGuiones[i]='-';
			}
				return palabraGuiones;
		}
	
		static boolean hayGuiones(char[]array) {
		
			for (char l:array) {
				if(l=='-') return true;
			} return false;
		}
}