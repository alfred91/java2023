package ejemplo5;

public class Coche {

	private String marca;
	private String matricula;
	
	public static int numCoches=0;
	
	public Coche(String marca, String matricula) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		numCoches=numCoches++;
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
		
	}
	
	@Override
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [marca=");
		builder.append(marca);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
	
}