package estructurasDeControl;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio27 {

	public static void main(String[] args) {
	System.out.println("Piensa un numero entre 1 y 100 ");
	System.out.println("");
	char mayor;
	char menor;
	
		Random r1=new Random();
		int n1=r1.nextInt(100)+1;
		System.out.println("Es "+n1+" ?");
		Scanner sc= new Scanner(System.in);
		System.out.println("Este  numero es mayor que el que has pensado? ('s' para si, 'n' para no, 'x' si acierto)");
		mayor=sc.next().charAt(0);
		
if  (mayor=='x') {System.out.println("He acertado");}
do {
if (mayor=='n') {
	Random r2=new Random();
	int n2=r2.nextInt(100-n1+1)+n1;
	System.out.println("Es "+n2+" ?");
	System.out.println("Este  numero es mayor que el que has pensado? ('s' para si, 'n' para no, 'x' si acierto)");
	mayor=sc.next().charAt(0);
	Random r3=new Random();
	
	int n3=r3.nextInt(100-n2+1)+n2;
	System.out.println("Es "+n3+" ?");
	System.out.println("Este  numero es mayor que el que has pensado? ('s' para si, 'n' para no, 'x' si acierto)");
	mayor=sc.next().charAt(0);
	Random r4=new Random();
	int n4=r4.nextInt(100-n3+1)+n3;
	System.out.println("Es "+n4+" ?");
	System.out.println("Este  numero es mayor que el que has pensado? ('s' para si, 'n' para no, 'x' si acierto)");
	mayor=sc.next().charAt(0);
	Random r5=new Random();
	int n5=r5.nextInt(100-n4+1)+n4;
	System.out.println("Es "+n5+" ?");
	System.out.println("Este  numero es mayor que el que has pensado? ('s' para si, 'n' para no, 'x' si acierto)");
	mayor=sc.next().charAt(0);}

else if(mayor=='s') {
		
		Random r6=new Random();
		int n6=r6.nextInt(n1-1+1)+1;
		System.out.println("Es "+n6+" ?");
		System.out.println("Este  numero es mayor que el que has pensado? ('s' para si, 'n' para no, 'x' si acierto)");
		mayor=sc.next().charAt(0);
		Random r7=new Random();
		int n7=r7.nextInt(n6-1+1)+1;
		System.out.println("Es "+n7+" ?");
		System.out.println("Este  numero es mayor que el que has pensado? ('s' para si, 'n' para no, 'x' si acierto)");
		mayor=sc.next().charAt(0);
		Random r8=new Random();
		int n8=r8.nextInt(n7-100+1)+1;
		System.out.println("Es "+n8+" ?");
		System.out.println("Este  numero es mayor que el que has pensado? ('s' para si, 'n' para no, 'x' si acierto)");
		mayor=sc.next().charAt(0);
		Random r9=new Random();
		int n9=r9.nextInt(n8-100+1)+1;
		System.out.println("Es "+n9+" ?");
		System.out.println("Este  numero es mayor que el que has pensado? ('s' para si, 'n' para no, 'x' si acierto)");
		mayor=sc.next().charAt(0);
	}
}while(mayor!='x');
	}
}