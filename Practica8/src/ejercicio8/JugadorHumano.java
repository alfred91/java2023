package ejercicio8;

public class JugadorHumano extends Jugador {
	
private Arma arma;

	public JugadorHumano(String nick, String clase, int salud) {
		super(nick, clase, salud);

		}
	
	public void equipar(Arma unArma) {
		this.arma = unArma;
		}
	
	@Override
	public boolean golpear(Jugador jugador) {
		
				//No tiene arma
		if (this.arma == null)  {
			
			return jugador.reducirVida(20);
			
		} else { //Si tiene arma
			
				//Comprobamos si el arma tiene balas
			if (this.arma.getDisparos() > 0) {
				
				//Reducir una bala
				this.arma.setDisparos( this.arma.getDisparos() - 1);
				
				//Quitar vida
				return jugador.reducirVida(this.arma.getPuntos());
				
			} else {
				
				return jugador.reducirVida(20);
			}
		}
	}
}