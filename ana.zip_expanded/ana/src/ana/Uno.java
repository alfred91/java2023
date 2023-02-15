package ana;

public class Uno {
	// atributos
	private int num1;
	private int num2;

	public Uno(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "Uno [num1=" + num1 + ", num2=" + num2 + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Uno nuevo = new Uno(30, 50);
		System.out.println("Usando método toString: " + nuevo.toString());
		System.out.println("El primer número es: " + nuevo.getNum1());
		System.out.println("El segundo número es: " + nuevo.getNum2());
		int result = nuevo.num1 * nuevo.getNum2();
		System.out.println("El resultado de la suma es: " + result);
		nuevo.setNum1(25);
		nuevo.setNum2(150);
		System.out.println("Usando método toString: " + nuevo.toString());
	}

}
