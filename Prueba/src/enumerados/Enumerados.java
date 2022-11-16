package enumerados;

public class Enumerados {
	
enum NombreMes {Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre}
enum Sexo {Hombre, Mujer, Perro}

	public static void main(String[] args) {
	
String mesCadena = "Enero";		
NombreMes mes = NombreMes.Enero;
Sexo sx = Sexo.Hombre;

System.out.println("Mi primo nacio en " + mes);
System.out.println("Mi primo es " + sx);
	}

}
