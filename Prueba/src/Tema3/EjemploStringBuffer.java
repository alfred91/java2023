package Tema3;

public class EjemploStringBuffer {

	public static void main(String[] args) {
		StringBuffer strb=new StringBuffer();
		
		for (int i=0; i<20; i++) {
			strb.append(String.valueOf(i));
			strb.append(" ");
		}
		
		String resultado = strb.toString();
		System.out.println(resultado);

		
		String cadena="";
		for(int i=0;i<20;i++) {
			cadena = cadena +String.valueOf(i);
			cadena = cadena + " ";
		}
		System.out.println(cadena);
	}

}
