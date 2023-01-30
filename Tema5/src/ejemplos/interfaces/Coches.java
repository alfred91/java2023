package ejemplos.interfaces;

import java.awt.Component;

import javax.swing.Renderer;

public class Coches implements  Renderizable {

	@Override
	public void render() {
		System.out.println("Dibujando coche en pantalla");

	}


}
