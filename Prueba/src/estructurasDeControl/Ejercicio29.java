package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio29 {

	public static void fecha() {
		int day=0;
		int month=0;
		int year=0;
		boolean correcta=true;
		boolean incorrecta=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dia: ");
		day=sc.nextInt();
		System.out.println("Nº Mes: ");
		day=sc.nextInt();
		System.out.println("Año: ");
		day=sc.nextInt();

		if (day>=1&&day<=31&&month>=1&&month<=12&&year>=1&&year<=3000) {
			System.out.println(correcta);
	} else System.out.println(incorrecta);
}
		public static void main(String[] args) {
	fecha();
	}

}
