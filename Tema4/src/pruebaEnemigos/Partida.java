package pruebaEnemigos;

import java.util.ArrayList;

public class Partida {

	private ArrayList<Enemigo> enemigos;

	public Partida() {
		super();
		this.enemigos = new ArrayList<>();
	}
	
	public void nuevoEnemigo(Enemigo e) {
		this.enemigos.add(e);
	}
	
	public void eliminarEnemigo(Enemigo e) {
		for(Enemigo ene: this.enemigos) {
			if (ene.equals(e)) {
				this.enemigos.remove(ene);
			}
		}
	}
	
	public void pintarEnemigos() {
		for(Enemigo ene: this.enemigos) {
			System.out.println(ene);
		}
	}
	
	
}
