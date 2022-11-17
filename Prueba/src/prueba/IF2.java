package prueba;

public class IF2 {

	public static void main(String[] args) {
		int edad=2;
		char sexo='h';
		
		if ( (edad>=0) && (edad<=11)) {
			if (sexo=='h'){
				System.out.println("Niño");
			} else if (sexo=='m') {
					System.out.println("Niña");
				}
				else if ((edad>=12) && (edad<=18)) {
					System.out.println("Adolescente");
					}
				else if ((edad>=19)&&(edad<=55)) {
					if (sexo=='h') {System.out.println("Hombre");
					} else if (sexo=='m') {
					System.out.println("Mujer");
					}
				} else if (edad>=56 && sexo=='h'){
					System.out.println("Viejo");
				} else if (edad>=56 && sexo=='m')
					{System.out.println("Vieja");}
				else {System.out.println("Datos incorrectos");}
			
		}
	}}