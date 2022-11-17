package prueba;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double nota1, nota2, nota3, notaExamen, notaFinal;
double mediaPracticas;
nota1=5;
nota2=0;
nota3=6;
notaExamen=4;

mediaPracticas =(nota1 +nota2 +nota3) /3;
notaFinal = (mediaPracticas * 0.6) + (notaExamen * 0.4);

if (mediaPracticas<3) {
	System.out.println("Suspenso");
	} else if (notaFinal<5) {System.out.println("Suspenso");
	}
	}
}