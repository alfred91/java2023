package ejemploEditorial;

import java.time.LocalDate;

import ejemploEditorial.Libro.Genero;

public class Test {

	public static void main(String[] args) {
		Biblioteca bbc= new Biblioteca();
		Autor a1= new Autor("Jose", "jose@gmail.com", "123456789");
		Autor a2= new Autor("Manuel", "jose@gmail.com", "123456789");
		Autor a3= new Autor("Gines", "jose@gmail.com", "123456789");
		
		Libro l1=new Libro("Libro1", "Planeta", LocalDate.of(1, 1, 2022), 600, 19,"ISBN1" ,1,Genero.DRAMA);
		Libro l2=new Libro("Libro1", "Satelite", LocalDate.of(1, 12, 2012), 601, 29,"ISBN1" ,1,Genero.TERROR);
		
		l1.addAutor(a1);
		l1.addAutor(a2);
		l2.addAutor(a3);
		
		
		bbc.addPublicacion(l1);
		bbc.addPublicacion(l2);

	}

}
