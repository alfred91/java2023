package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio2 {
	
public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.println("Introduce un numero");
int numero = Integer.parseInt(sc.nextLine());

if (numero%2==0 && numero%3==0 && numero%5==0 && numero%7==0) {
	System.out.println("ES MULTIPLO DE TODOS!");
}
else if (numero%2==0 && numero%3==0 && numero%5==0) {
	System.out.println("Es multiplo de 2, 3 y 5");
}
else if (numero%2==0 && numero%3==0 && numero%7==0) {
	System.out.println("Es multiplo de 2, 3 y 7");
}
else if (numero%2==0 && numero%3==0) {
	System.out.println("Es multiplo de 2 y de 3");
}
else if (numero%3==0 && numero%5==0 && numero%7==0) {
	System.out.println("Es multiplo de 3 y 5 y de 7");
}
else if (numero%3==0 && numero%5==0) {
	System.out.println("Es multiplo de 3 y 5");
}
else if(numero%3==0 && numero%7==0) {
	System.out.println("Es multiplo de 3 y 7");
}
else if(numero%5==0 && numero%7==0 && numero%2==0) {
	System.out.println("Es multiplo de 5, 7 y 2");
}
else if(numero%5==0 && numero%7==0) {
	System.out.println("Es multiplo de 5 y 7");
}
else if(numero%5==0 && numero%2==0) {
	System.out.println("Es multiplo de 5 y 2");
}

else if(numero%7==0) {System.out.println("Es multiplo de 7");}
else if(numero%5==0) {System.out.println("Es multiplo de 5");}
else if(numero%3==0) {System.out.println("Es multiplo de 3");}
else if(numero%2==0) {System.out.println("Es multiplo de 2");}

else if (numero%7!=0 && numero%5!=0 && numero%3!=0 && numero%2!=0)
{ System.out.println("No dispongo de multiplos para "+numero);}
}	}
