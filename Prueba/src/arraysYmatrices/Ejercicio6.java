package arraysYmatrices;
import java.util.Scanner;
public class Ejercicio6 {
public static void creciente() {
	
Scanner sc=new Scanner(System.in);
int i=0;
int n[] = new int[5];
boolean creciente= false, decreciente=false;
for(i=0; i<5; i++)	{
	 System.out.printf("Introduzca número "+(i+1)+" : ");
	 n[i] = sc.nextInt();
}
for (i=0; i<2;i++) {
	if (n[i]<n[i+1]&&n[i+1]<n[i+2]&&n[i+2]<n[i+3]) {
	creciente= true;								}
	if (n[i]>n[i+1]&&n[i+1]>n[i+2]&&n[i+2]>n[i+3]) {
	decreciente=true;								}
 if (creciente == true && decreciente == false) {
	System.out.println("Creciente");
}
else if (creciente == false && decreciente == true) {
	System.out.println("Decreciente");
}
else if(creciente == false && decreciente == false) {
	System.out.println("Desordenado");
}
else  {System.out.println("Desordenado");}
	}
}

public static void main(String[] args) {
	creciente();
}}