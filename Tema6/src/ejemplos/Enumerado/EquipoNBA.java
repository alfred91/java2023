package ejemplos.Enumerado;

public enum EquipoNBA {
	
	BC ("Boston Celtics"),
	BN ("Brooklyn Nets"),
	NYK ("Philadelphia 76ers"),
	TR ("Toronto Raptors"),
	GSW ("Golden State Warriors"),
	LAC("Los Angeles Clippers"),
	MG ("Menphis Grizzlies");

	private String nombre;

	private EquipoNBA(String string) {
	this.nombre = string;
		}

	public String getNombreCompleto(){
	return this.nombre;
	}
}