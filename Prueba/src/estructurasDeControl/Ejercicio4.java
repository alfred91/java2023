package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void billetes(int num) {
		
	int euros=num, quinientos=0, doscientos=0,
		cien=0, cincuenta=0, veinte=0, diez=0, cinco=0,
		monedas=0, resto=0;
	
quinientos=euros/500;

if (euros%500!=0) {
	resto=(euros%500);
	doscientos=(int)(resto)/200;

	resto=(resto%200);
}
	if (resto!=0) {
		cien=(int)(resto) /100;
		
		resto=(resto%100);
	}
		if (resto!=0) {
			cincuenta=(int)(resto)/50;
			
			resto=(resto%50);
			veinte=(int)(resto)/20;
		}
		if(resto!=0) {
			resto=(resto%20);
			diez=(int)(resto)/10;
		}
		if (resto!=0) {
			resto=(int)(resto%10);
			cinco=(int)(resto)/5;
		}
			if (resto!=0) {
				resto=(int)(resto%5);
				monedas=(int)(resto)/1;
			}
			
	System.out.println("> Billetes de 500€: "+quinientos);
	System.out.println("> Billetes de 200€: "+doscientos);
	System.out.println("> Billetes de 100€: "+cien);
	System.out.println("> Billetes de 50€: " + cincuenta);
	System.out.println("> Billetes de 20€: " + veinte);
	System.out.println("> Billetes de 10€: " + diez);
	System.out.println("> Billetes de 5€: " + cinco);
	System.out.println("> Monedas de 1€: " + monedas);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int error=0; int num=0;
		
		do {
			try { System.out.println("Introduce una cantidad");
			num = Integer.parseInt(sc.nextLine()); 
			if(num<=0) {
				System.out.println("ERROR");
			} else {
				break;
			}
			} catch (Exception e) {
				error=1;
				System.out.println("Error1");
				System.out.println(e.getMessage());
			}
		}while(error ==1 || num<=0);
		billetes(num);
		sc.close();
			}
	}