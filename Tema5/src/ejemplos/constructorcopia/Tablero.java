package ejemplos.constructorcopia;

import java.util.ArrayList;

public class Tablero {

	public static int longX;
	public static int longY;
	
	static {
		Tablero.longX = 50;
		Tablero.longY = 50;
	}
	
	private ArrayList<Robot> robots;
	
	
	public Tablero() {
		this.robots = new ArrayList<>(20);
	}
	
	public void agregarRobot(Robot r) {
		this.robots.add(r);
	}
	
	
	public void pintarTablero() {
		
		for(int i=0; i<Tablero.longX; i++) {
			for(int j=0; j<Tablero.longY; j++) {	
				if (this.hayRobot(i,j)) {
					System.out.print("o");
				} else {
					System.out.print("-");	
				}
								
			}
			System.out.println();
		}
				
	}
	
	public boolean hayRobot(int i, int j) {
		for(Robot r: this.robots) {
			if (r.getCoordX() == i & r.getCoordY() == j)
				return true;
		}
		
		return false;
	}
	
	
	
	
}
