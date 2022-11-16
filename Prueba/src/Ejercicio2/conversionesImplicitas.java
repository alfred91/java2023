package Ejercicio2;

public class conversionesImplicitas {

	public static void main(String[] args) {
		int medio=10;  //4bytes
		short corto=10;  //2 bytes
		long largo=1000;  //8 bytes
		char car = 'a';
		double decimal = 10.5e17d;

		
		System.out.println(corto);
		
		largo=corto;  //Conversion implicita -> variable destino tiene mas precision que la variable a asignar
		
		medio = car;   // Caracter a entero, porque se graban como numeros
		
		System.out.println(medio);
		
		car=(char) medio; // Conversion explicita -> CAST
		
		System.out.println(car);
		
		largo = (long) decimal;  //Se puede pero no es interesante porque la representacion interna es diferente.
		System.out.println(largo);
		
		decimal = 45.946;
		largo=(long) decimal; //Quitar la parte decimal de un numero
		System.out.println(largo);
		
		
	}

}