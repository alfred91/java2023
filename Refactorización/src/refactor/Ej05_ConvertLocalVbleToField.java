package refactor;

public class Ej05_ConvertLocalVbleToField {
	private int lado;

	public Ej05_ConvertLocalVbleToField() {
		lado = 5;
	}

	public int calcularArea() {
		return lado * lado;
	}
}
