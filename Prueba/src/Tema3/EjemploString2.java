package Tema3;

public class EjemploString2 {

	public static void main(String[] args) {
		
		String direccionIP="192.168.1.72";
		
		String op1=direccionIP.substring(0,direccionIP.indexOf("."));
		String op2=direccionIP.substring(4,7);
		String op3=direccionIP.substring(8,9);
		String op4=direccionIP.substring(10,12);
		
		System.out.println(op1+" "+op2+" "+op3+" "+op4);
		
		
		int posicion=0;
		int suma=0;
		String num="";
		while  (direccionIP.indexOf(".", posicion)>=0) {
			num = direccionIP.substring(posicion, direccionIP.indexOf(".",posicion));
			System.out.println(num);
			suma= suma +Integer.parseInt(num);
			posicion = direccionIP.indexOf(".",posicion)+1;
		}
		num= direccionIP.substring(posicion);
		System.out.println(num);
		System.out.println(suma);
	}
}