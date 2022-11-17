package prueba;

public class Switch2 {

	public static void main(String[] args) {

	char operador = '+';
	double operando1, operando2, resultado;
	operando1=30;
	operando2=5;
	
	switch (operador) {
	case '+':
		resultado=operando1+operando2;
		System.out.println(resultado);
		break;
	case '-': 
		resultado=operando1-operando2;
		System.out.println(resultado);
		break;
	case '*': 
		resultado=operando1*operando2;
		System.out.println(resultado);
		break;
	case '/': 
		resultado=operando1/operando2;
		System.out.println(resultado);	
	break;
	default:
		throw new IllegalArgumentException("Unexpected value: " + operador);
	}

	}
}