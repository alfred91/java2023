package ejercicio8;

public class TestIncidencia {

	public static void main(String[] args) {

		Incidencia primera=new Incidencia(01,"Abierta", "Han robado los extintores", "Quemar un poco el edificio para concienciar de que realmente son necesarios", 100, 198);
		Incidencia segunda=new Incidencia(02,"Cerrada", "Se ha roto la puerta principal del edificio", "Llamar a un cerrajero, dividir la cuenta entre el numero de viviendas", 100, 199);
		Incidencia tercera=new Incidencia(03,"Abierta", "Cortes de luz sin motivo aparente", "Llamar a la compania electrica que revisen la acometida principal y las viviendas en caso de que fuera necesario", 100, 200);
	
		System.out.println(primera);
		System.out.println(segunda);
		System.out.println(tercera);
	}

}