package ejemplo4;

public class Aplicacion {

	public static void main(String[] args) {
		Enemigo e1 = new Enemigo("E1","Bicho",100);
		Enemigo e2 = new Enemigo("E2","Tortuga", 120);
		
		for(int i=0; i<6; i++)
			e1.subirNivel();
		
		for(int i=0; i<2; i++)
			e2.subirNivel();
		
		System.out.println("Número de enemigos: " + Enemigo.NumEnemigos);
		
		System.out.println(e1);
		System.out.println(e2);
		
		e1.recibirDanio(400);
		e2.recibirDanio(110);
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println("Número de enemigos: " + Enemigo.NumEnemigos);

	}

}
