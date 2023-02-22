package ana;
public class ParImpar {
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int i = 0;
		int pares = 0;
		int impares = 0;
		int nuevo;
		while(i <3) {
		nuevo =(int)(Math.random()*100); //generación de número aleatorio
				if(nuevo % 2 == 0) {
					pares++;
					System.out.println("El número "+ nuevo +" es par");
				}
				else {
					impares ++;
					System.out.println("El número "+ nuevo +" es impar");
				}
				i++;
			}
		System.out.println("Has introducido " + i +" números de los cuales hay " + pares + " son pares y  "+ impares +" son impares");
		}
	}




