package ahorcado;

import java.util.Scanner;

public class TestAhorcado {
	

public static void main(String[] args) {
		
		String palabraSecreta=Main.damePalabraSecreta();
			char [] palabraGuiones=Main.dameGuionesDePalabra(palabraSecreta);
			boolean juegoTerminado=false;
			int intentos=7;
			Scanner sc = new Scanner(System.in);
		
			do {
				System.out.println("Te quedan "+intentos+" intentos");
				System.out.println(palabraGuiones);
				System.out.println("Introduce una letra: ");
				char letra= sc.next().charAt(0);
				boolean algunaLetraAcertada=false;
					for (int i=0;i<palabraSecreta.length();i++) {
						if (palabraSecreta.charAt(i)==letra) {
								palabraGuiones[i]=letra;
									algunaLetraAcertada=true;
					}
				}
					
			if(!algunaLetraAcertada) {
				System.out.println("No has acertado "); --intentos;}
						
			else {--intentos; System.out.println("Correcto ");}
			if (intentos==0) {System.out.println("Has agotado los intentos");
				juegoTerminado=true;
				}
					else {
						boolean juegoGanado=!Main.hayGuiones(palabraGuiones);
							if(juegoGanado) {System.out.println("Has ganado!!");
							juegoTerminado=true;}
					}
		
				} while (!juegoTerminado);
					sc.close();
			}
}