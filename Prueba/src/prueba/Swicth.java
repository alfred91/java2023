package prueba;

public class Swicth {

	public static void main(String[] args) {
		
int diaSemana=2;

switch (diaSemana) {
	case 1:
		System.out.println("Lunes");
	break;
	case 2: 
	System.out.println("Martes");
break;
case 3: 
		System.out.println("Miercoles");
	 break;
case 4:
	System.out.println("Jueves");
 break;
case 5: {
	System.out.println("Viernes");
}
default:
throw new IllegalArgumentException("Unexpected value: " + diaSemana);
					}
	}
}