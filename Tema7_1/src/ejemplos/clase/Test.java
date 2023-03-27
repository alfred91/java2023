package ejemplos.clase;

import java.time.LocalDate;

import ejemplos.clase.Libro.Genero;

public class Test {

	public static void main(String[] args) {
		
		Bolsa<Float, String> numeros = new Bolsa<>();
		numeros.nuevo(1f);
		numeros.nuevo(4f);
		System.out.println(numeros);
		
		/*
		Bolsa<String> palabras = new Bolsa<>();
		palabras.nuevo("Hola");
		palabras.nuevo("Mundo");
		System.out.println(palabras);
		
		Bolsa<Libro> libros = new Bolsa<>();
		libros.nuevo(new Libro("Libro de prueba", "nose", LocalDate.now(), 100, 15, "adsfaf", 10, Genero.DRAMA));
		System.out.println(libros);
		*/
		
	}

}
